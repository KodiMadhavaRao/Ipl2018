package com.madhav.com.ipl2018.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.google.gson.Gson;
import com.madhav.com.ipl2018.R;
import com.madhav.com.ipl2018.di.component.ActivityComponent;
import com.madhav.com.ipl2018.di.component.DaggerActivityComponent;
import com.madhav.com.ipl2018.di.module.ActivityModule;
import com.madhav.com.ipl2018.di.qualifier.CommentryQualifier;
import com.madhav.com.ipl2018.entity.CompletedMatchStatus;
import com.madhav.com.ipl2018.entity.Matches;
import com.madhav.com.ipl2018.entity.Scoring;
import com.madhav.com.ipl2018.entity.model.MatchFlags;
import com.madhav.com.ipl2018.net.service.ScoresService;
import com.madhav.com.ipl2018.view.adapter.CompletedMatchesAdapter;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class CompletedMatchActivity extends AppCompatActivity implements CompletedMatchesAdapter.CompleteMatchClickListener, Callback<Scoring> {

    private List<MatchFlags> matchFlags;
    @Inject
    @CommentryQualifier
    Retrofit retrofit;
    List<CompletedMatchStatus> summarys;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_completed_match);
        recyclerView = (RecyclerView) findViewById(R.id.completed_matches_id);
        summarys=new ArrayList<>();
        ActivityComponent activityComponent = DaggerActivityComponent.builder().activityModule(new ActivityModule(this))
                .build();
        activityComponent.inject(this);

        Matches matches = new Gson().fromJson(loadJSONFromAsset(), Matches.class);
        matchFlags = filterByCurrentDate(matches.getSchedule());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ScoresService scoresService = retrofit.create(ScoresService.class);
        for (int i=0;i<matchFlags.size();i++){
            Call<Scoring> scoring = scoresService.getScoring(matchFlags.get(i).getScheduleBeans().getMatchId().getId());
            scoring.enqueue(this);
        }

    }

    public String loadJSONFromAsset() {
        String json = null;
        try {
            InputStream is = getAssets().open("ipl.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }

    private List<MatchFlags> filterByCurrentDate(List<Matches.ScheduleBean> schedule) {
        List<MatchFlags> matchFlags = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String cDate = calendar.get(Calendar.YEAR) + "-" + (calendar.get(Calendar.MONTH) + 1) + "-" + calendar.get(Calendar.DATE);
        Date currentDate = null;
        try {
            currentDate = sdf.parse(cDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < schedule.size(); i++) {
            Matches.ScheduleBean scheduleBean = schedule.get(i);
            String sDate = scheduleBean.getMatchDate();
            Date matchDate = null;
            try {
                matchDate = sdf.parse(getIntDate(sDate, 0, 4) + "-" + getIntDate(sDate, 5, 7) + "-" + getIntDate(sDate, 8, 10));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (matchDate.before(currentDate) || matchDate.compareTo(currentDate) == 0) {
                if (matchDate.compareTo(currentDate) == 0)
                    matchFlags.add(new MatchFlags(scheduleBean, true));
                else
                    matchFlags.add(new MatchFlags(scheduleBean, false));
            }

        }
        return matchFlags;

    }

    private int getIntDate(String matchDate, int start, int end) {
        return Integer.parseInt(matchDate.substring(start, end));
    }

    @Override
    public void completedMatch(View v, int postion, int matchId) {
        Intent intent = new Intent(this, CommentryActivity.class);
        intent.putExtra("matchId", "" + matchId);
        startActivity(intent);
    }

    @Override
    public void onResponse(Call<Scoring> call, Response<Scoring> response) {
        if (response.body().getMatchInfo().getMatchStatus()!=null) {
            if (response.body().getMatchInfo().getMatchStatus().getText() != null) {
                summarys.add(new CompletedMatchStatus(String.valueOf(response.body().getMatchId().getId()),response.body().getMatchInfo().getMatchStatus().getText()));
            }
        }else {
            summarys.add(new CompletedMatchStatus(String.valueOf(response.body().getMatchId().getId()),response.body().getMatchInfo().getMatchSummary()));
        }

        if (matchFlags.size()==summarys.size()){
            Collections.sort(summarys, new Comparator<CompletedMatchStatus>() {
                @Override
                public int compare(CompletedMatchStatus o1, CompletedMatchStatus o2) {
                    return o1.getMatchId().compareTo(o2.getMatchId());
                }
            });
            CompletedMatchesAdapter completedMatchesAdapter = new CompletedMatchesAdapter(this, matchFlags,summarys);
            completedMatchesAdapter.setOnItemClickListener(this);
            recyclerView.setAdapter(completedMatchesAdapter);
        }
    }

    @Override
    public void onFailure(Call<Scoring> call, Throwable t) {

    }
}
