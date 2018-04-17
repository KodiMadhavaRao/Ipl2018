package com.madhav.com.ipl2018.view.activity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.madhav.com.ipl2018.R;
import com.madhav.com.ipl2018.di.component.ActivityComponent;
import com.madhav.com.ipl2018.di.component.DaggerActivityComponent;
import com.madhav.com.ipl2018.di.module.ActivityModule;
import com.madhav.com.ipl2018.di.qualifier.Datacdn;
import com.madhav.com.ipl2018.entity.PointsTable;
import com.madhav.com.ipl2018.net.service.CdnService;
import com.madhav.com.ipl2018.util.StringResponse;

import java.io.IOException;

import javax.inject.Inject;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class PointsTableActivity extends AppCompatActivity implements Callback<ResponseBody> {
    @Inject
    @Datacdn
    Retrofit retrofit;

    FrameLayout frameLayout;
    TableLayout tableLayout;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityComponent activityComponent = DaggerActivityComponent.builder().activityModule(new ActivityModule(this))
                .build();
        activityComponent.inject(this);

        tableLayout = new TableLayout(this);
        tableLayout.setVisibility(View.GONE);
        tableLayout.setBackgroundColor(getResources().getColor(R.color.table_bg));


        relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new HorizontalScrollView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        relativeLayout.addView(tableLayout);
        frameLayout = new FrameLayout(this);
        relativeLayout.addView(frameLayout);
        frameLayout.setLayoutParams(new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        frameLayout.setVisibility(View.VISIBLE);
        frameLayout.setBackgroundColor(Color.parseColor("#000000"));
        frameLayout.setAlpha(0.4f);

        ProgressBar progressBar = new ProgressBar(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.gravity = Gravity.CENTER;
        frameLayout.addView(progressBar);
        progressBar.setLayoutParams(layoutParams);
        progressBar.setIndeterminate(true);

        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(this);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setLayoutParams(new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        horizontalScrollView.addView(relativeLayout);
        setContentView(horizontalScrollView);
        CdnService cdnService = retrofit.create(CdnService.class);
        Call<ResponseBody> tableValues = cdnService.getTableValues();
        tableValues.enqueue(this);
    }

    public TableRow getTableRow(PointsTable.Groups.Standings groups) {
        TableRow tableRow = new TableRow(this);
        TableLayout.LayoutParams layoutParams = new TableLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(1, 1, 1, 1);
        tableRow.setLayoutParams(layoutParams);
        String[] values = new String[]{groups.getTeam().getFullName(), Integer.toString(groups.getPlayed()), Integer.toString(groups.getWon()), Integer.toString(groups.getLost()), Integer.toString(groups.getTied()), Integer.toString(groups.getNoResult()), groups.getNetRunRate(), Integer.toString(groups.getPoints()),""+groups.getRecentForm().get(0).getOutcome()+" "+groups.getRecentForm().get(1).getOutcome()+" "+groups.getRecentForm().get(2).getOutcome() };
        for (int i = 0; i < values.length; i++) {
            tableRow.addView(getTextView(values[i], i == 0));
        }
        return tableRow;
    }

    public TextView getTextView(String value, boolean islabel) {
        TextView textView = new TextView(this);
        if (islabel)
            textView.setTextColor(getResources().getColor(R.color.team_text));
        textView.setGravity(Gravity.CENTER);
        textView.setPadding(20, 20, 20, 20);
        textView.setText(value);
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(1, 1, 1, 1);
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
        tableLayout.setVisibility(View.VISIBLE);
        PointsTable pointsTable = null;
        try {
            String sjsonResponse = new StringResponse().getStringResponse(response.body().bytes());
            pointsTable = new Gson().fromJson(sjsonResponse, PointsTable.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        frameLayout.setVisibility(View.GONE);
        TableRow tableRow = new TableRow(this);
        tableRow.setLayoutParams(new TableLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        String[] header = new String[]{"Team", "Pld", "Won", "Lost", "Tied", "N/R", "Net RR", "Pts","Recent Form"};
        tableRow.setBackgroundColor(getResources().getColor(R.color.row_two));
        for (int i = 0; i < header.length; i++) {
            tableRow.addView(getTextView(header[i], false));
        }
        tableLayout.addView(tableRow);
        for (int i = 0; i < pointsTable.getGroups().get(0).getStandings().size(); i++) {
            TableRow tableRow1 = getTableRow(pointsTable.getGroups().get(0).getStandings().get(i));
            if (i % 2 == 0) {
                tableRow1.setBackgroundColor(getResources().getColor(R.color.row_one));
            } else {
                tableRow1.setBackgroundColor(getResources().getColor(R.color.row_two));
            }
            tableLayout.addView(tableRow1);
        }
    }

    @Override
    public void onFailure(Call<ResponseBody> call, Throwable t) {
        tableLayout.setVisibility(View.VISIBLE);
        frameLayout.setVisibility(View.GONE);
        relativeLayout.removeAllViews();
        TextView textView = new TextView(this);
        textView.setText("" + t.getMessage().toString());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.addRule(RelativeLayout.CENTER_IN_PARENT);
        textView.setLayoutParams(layoutParams);
        relativeLayout.addView(textView);
        Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
    }
}

