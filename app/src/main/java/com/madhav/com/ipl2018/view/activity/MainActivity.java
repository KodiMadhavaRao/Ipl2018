package com.madhav.com.ipl2018.view.activity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import com.madhav.com.ipl2018.R;
import com.madhav.com.ipl2018.di.component.ActivityComponent;
import com.madhav.com.ipl2018.di.component.DaggerActivityComponent;
import com.madhav.com.ipl2018.di.module.ActivityModule;
import com.madhav.com.ipl2018.di.qualifier.ActivityContext;
import com.madhav.com.ipl2018.entity.Matches;
import com.madhav.com.ipl2018.entity.model.MatchFlags;
import com.madhav.com.ipl2018.view.adapter.MatchesAdapter;
import com.madhav.com.ipl2018.view.dialog.TeamSelectionDialog;


public class MainActivity extends AppCompatActivity implements MatchesAdapter.ItemClickListener, View.OnClickListener, TeamSelectionDialog.OnItemSelection {
    @Inject
    @ActivityContext
    Context context;
    MatchesAdapter matchesAdapter;
    String teamcolors[] = {"#AFFFFFFF", "#FDB913", "#004C93", "#DA1F3D", "#6F2C91", "#00AEEF", "#004B8C", "#FF3245", "#FF9C00"};
    List<MatchFlags> matchFlags;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.match_schedule);
        ActivityComponent activityComponent = DaggerActivityComponent.builder().activityModule(new ActivityModule(this))
                .build();
        activityComponent.inject(this);
        Button filterTeam = (Button) findViewById(R.id.filter_by_team);
        filterTeam.setOnClickListener(this);
        Button filtereVenue = (Button) findViewById(R.id.filter_by_venue);
        filtereVenue.setOnClickListener(this);
        Matches matches = new Gson().fromJson(loadJSONFromAsset(), Matches.class);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.matches_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        matchFlags = filterByCurrentDate(matches.getSchedule());
        matchesAdapter = new MatchesAdapter(this, matchFlags);
        matchesAdapter.setOnRecyclerItemClickListener(this);
        recyclerView.setAdapter(matchesAdapter);
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
            if (matchDate.after(currentDate) || matchDate.compareTo(currentDate) == 0) {
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

    @Override
    public void onItemClick(View view, int position) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.filter_by_team:
                openDialogFrament("Team");
                break;
            case R.id.filter_by_venue:
                openDialogFrament("Venue");
                break;
        }
    }

    private void openDialogFrament(String selection) {
        TeamSelectionDialog teamSelectionDialog = new TeamSelectionDialog();
        teamSelectionDialog.onFilterItemClick(this);
        teamSelectionDialog.show(getFragmentManager(), selection);
    }

    @Override
    public void onItemClick(View view, int selctionId, String selection, boolean isclicked) {

        ProgressBar progress = (ProgressBar) findViewById(R.id.loading_progress);

        if (isclicked) {
            ((TextView) findViewById(R.id.filter_by_team)).setText(selection);
            ((TextView) findViewById(R.id.filter_by_venue)).setText("All Venues");
            if (selection.equals("All Teams")) {
                setRecyclerData(matchFlags);

            } else {
                List<MatchFlags> scheduleBeans = filterByTeam(selection);
                setRecyclerData(scheduleBeans);
                toast("Filtered By teams :\n" + selection + " " + scheduleBeans.size(), Color.parseColor(teamcolors[selctionId]));
            }

        } else {
            ((TextView) findViewById(R.id.filter_by_venue)).setText(selection);
            ((TextView) findViewById(R.id.filter_by_team)).setText("All Teams");
            if (selection.equals("All Venues")) {
                setRecyclerData(matchFlags);
            } else {
                List<MatchFlags> scheduleBeans = filterByVenue(selection);
                setRecyclerData(scheduleBeans);
                toast("Filtered " + selection + "Venue :\n" + scheduleBeans.size(), Color.argb(150, 0, 0, 0));
            }
        }
        progress.setVisibility(View.INVISIBLE);
    }

    private void setRecyclerData(List<MatchFlags> scheduleBeans) {
        RecyclerView recyclerView = ((RecyclerView) findViewById(R.id.matches_list));
        recyclerView.setAdapter(null);
        recyclerView.setLayoutManager(null);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        MatchesAdapter matchesAdapter = new MatchesAdapter(this, scheduleBeans);
        matchesAdapter.setOnRecyclerItemClickListener(this);
        recyclerView.setAdapter(matchesAdapter);
        matchesAdapter.notifyDataSetChanged();
    }


    private List<MatchFlags> filterByVenue(String selection) {
        List<MatchFlags> scheduleBeans = new ArrayList<>();
        List<MatchFlags> matches = matchFlags;
        for (int i = 0; i < matches.size(); i++) {
            if (matches.get(i).getScheduleBeans().getVenue().getCity().equals(selection)) {
                scheduleBeans.add(matches.get(i));
            }
        }
        return scheduleBeans;
    }

    private List<MatchFlags> filterByTeam(String selectedTeam) {
        List<MatchFlags> scheduleBeans = new ArrayList<>();
        List<MatchFlags> matches = matchFlags;
        for (int i = 0; i < matches.size(); i++) {
            if (matches.get(i).getScheduleBeans().getTeam1().getTeam().getFullName().equals(selectedTeam) || matches.get(i).getScheduleBeans().getTeam2().getTeam().getFullName().equals(selectedTeam)) {
                scheduleBeans.add(matches.get(i));
            }
        }
        return scheduleBeans;
    }

    public void toast(String message, int color) {
        Toast toast = new Toast(this);
        TextView textView = new TextView(this);
        textView.setTextColor(Color.WHITE);
        textView.setBackgroundColor(color);
        textView.setPadding(12, 12, 12, 12);
        textView.setText(message);
        toast.setView(textView);
        textView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        toast.setGravity(Gravity.FILL_HORIZONTAL | Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.show();
    }
}
