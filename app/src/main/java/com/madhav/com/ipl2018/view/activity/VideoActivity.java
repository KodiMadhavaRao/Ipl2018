package com.madhav.com.ipl2018.view.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;

import javax.inject.Inject;

import com.madhav.com.ipl2018.R;
import com.madhav.com.ipl2018.di.component.ActivityComponent;
import com.madhav.com.ipl2018.di.component.DaggerActivityComponent;
import com.madhav.com.ipl2018.di.module.ActivityModule;
import com.madhav.com.ipl2018.di.qualifier.ActivityContext;
import com.madhav.com.ipl2018.di.qualifier.ApiPlatform;
import com.madhav.com.ipl2018.entity.VideoThumb;
import com.madhav.com.ipl2018.net.service.ApiService;
import com.madhav.com.ipl2018.view.adapter.VideoAdapter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by madhav on 4/9/2018.
 */

public class VideoActivity extends AppCompatActivity implements Callback<VideoThumb> {
    @Inject
    @ActivityContext
    Context context;
    @Inject
    @ApiPlatform
    Retrofit retrofit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_list);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.progressBarHolder);
        AlphaAnimation inAnimation = new AlphaAnimation(0f, 1f);
        inAnimation.setDuration(200);
        frameLayout.setAnimation(inAnimation);
        frameLayout.setVisibility(View.VISIBLE);
        ActivityComponent activityComponent = DaggerActivityComponent.builder().activityModule(new ActivityModule(this)).build();
        activityComponent.inject(this);
        ApiService apiService = retrofit.create(ApiService.class);
        Call<VideoThumb> videoThumb = apiService.getVideoThumb();
        videoThumb.enqueue(this);
    }

    @Override
    public void onResponse(Call<VideoThumb> call, Response<VideoThumb> response) {
        AlphaAnimation outAnimation = new AlphaAnimation(1f, 0f);
        outAnimation.setDuration(200);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.progressBarHolder);
        frameLayout.setAnimation(outAnimation);
        frameLayout.setVisibility(View.GONE);
        VideoThumb videoThumb = response.body();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.videos_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new VideoAdapter(this, videoThumb));
    }

    @Override
    public void onFailure(Call<VideoThumb> call, Throwable t) {

    }
}
