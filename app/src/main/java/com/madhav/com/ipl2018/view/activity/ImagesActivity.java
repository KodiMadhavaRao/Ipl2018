package com.madhav.com.ipl2018.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;

import com.madhav.com.ipl2018.R;
import com.madhav.com.ipl2018.di.component.ActivityComponent;
import com.madhav.com.ipl2018.di.component.DaggerActivityComponent;
import com.madhav.com.ipl2018.di.module.ActivityModule;
import com.madhav.com.ipl2018.di.qualifier.ApiPlatform;
import com.madhav.com.ipl2018.entity.ImagesOfMatch;
import com.madhav.com.ipl2018.net.service.ApiService;
import com.madhav.com.ipl2018.view.adapter.ImagesAdapter;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by madhav on 4/13/2018.
 */

public class ImagesActivity extends AppCompatActivity implements Callback<ImagesOfMatch> {
    @Inject
    @ApiPlatform
    Retrofit retrofit;
    private RecyclerView recyclerView;
    private FrameLayout frame;
    private String matchId;

    //    https://api.platform.iplt20.com/content/ipl/photo/EN/?references=CRICKET_MATCH:7898&tags=gallery-photo&pageSize=150
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.images_list);
        recyclerView = (RecyclerView) findViewById(R.id.images_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        frame = (FrameLayout) findViewById(R.id.images_frame_progress);
        frame.setVisibility(View.VISIBLE);
        ActivityComponent activityComponent = DaggerActivityComponent.builder().activityModule(new ActivityModule(this)).build();
        activityComponent.inject(this);
        Intent intent = getIntent();
        matchId = intent.getStringExtra("matchId");
        ApiService apiService = retrofit.create(ApiService.class);
        Call<ImagesOfMatch> images = apiService.getImages("CRICKET_MATCH:" + matchId);
        images.enqueue(this);

    }

    @Override
    public void onResponse(Call<ImagesOfMatch> call, Response<ImagesOfMatch> response) {
        frame.setVisibility(View.GONE);
        recyclerView.setAdapter(new ImagesAdapter(this, response.body()));
    }

    @Override
    public void onFailure(Call<ImagesOfMatch> call, Throwable t) {
        frame.setVisibility(View.GONE);
    }
}
