package com.madhav.com.ipl2018.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import javax.inject.Inject;

import com.madhav.com.ipl2018.R;
import com.madhav.com.ipl2018.di.component.ActivityComponent;
import com.madhav.com.ipl2018.di.component.DaggerActivityComponent;
import com.madhav.com.ipl2018.di.module.ActivityModule;
import com.madhav.com.ipl2018.di.qualifier.ActivityContext;

/**
 * Created by madhav on 4/9/2018.
 */

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    @Inject
    @ActivityContext
    Context context;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getButtonsView());
        ActivityComponent activityComponent = DaggerActivityComponent.builder().activityModule(new ActivityModule(this))
                .build();
        activityComponent.inject(this);

    }

    public View getButtonsView() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        linearLayout.addView(getButton(R.id.maches_list, "Matches List"));
        linearLayout.addView(getButton(R.id.videos_list, "Videos List"));
        linearLayout.addView(getButton(R.id.points_views, "Points table"));
        linearLayout.addView(getButton(R.id.squads_views, "Squads"));
        linearLayout.addView(getButton(R.id.completed_match_views, "Completed Matches"));
        return linearLayout;
    }

    public Button getButton(int id, String text) {
        Button button = new Button(this);
        button.setText(text);
        button.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        button.setId(id);
        button.setOnClickListener(this);
        return button;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.maches_list:
                openActivity(MainActivity.class);
                break;
            case R.id.videos_list:
                openActivity(VideoActivity.class);
                break;
            case R.id.points_views:
                openActivity(PointsTableActivity.class);
                break;
            case R.id.squads_views:
                openActivity(SquadsActivity.class);
                break;
            case R.id.completed_match_views:
                openActivity(CompletedMatchActivity.class);
                break;
        }
    }

    private void openActivity(Class destination) {
        Intent intent = new Intent(HomeActivity.this, destination);
        startActivity(intent);
    }
}
