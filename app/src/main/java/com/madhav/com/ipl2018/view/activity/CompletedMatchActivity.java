package com.madhav.com.ipl2018.view.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.google.gson.Gson;
import com.madhav.com.ipl2018.R;
import com.madhav.com.ipl2018.entity.Matches;
import com.madhav.com.ipl2018.entity.model.MatchFlags;
import com.madhav.com.ipl2018.view.adapter.CompletedMatchesAdapter;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class CompletedMatchActivity extends AppCompatActivity implements CompletedMatchesAdapter.CompleteMatchClickListener {

    private List<MatchFlags> matchFlags;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_completed_match);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.completed_matches_id);
        Matches matches = new Gson().fromJson(loadJSONFromAsset(), Matches.class);
        matchFlags = filterByCurrentDate(matches.getSchedule());
        CompletedMatchesAdapter completedMatchesAdapter = new CompletedMatchesAdapter(this, matchFlags);
        completedMatchesAdapter.setOnItemClickListener(this);
        recyclerView.setAdapter(completedMatchesAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

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
        Intent intent=new Intent(this,CommentryActivity.class);
        intent.putExtra("matchId",""+matchId);
        startActivity(intent);
    }
}
