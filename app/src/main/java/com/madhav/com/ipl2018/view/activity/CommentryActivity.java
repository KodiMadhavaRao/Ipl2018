package com.madhav.com.ipl2018.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.madhav.com.ipl2018.di.component.ActivityComponent;
import com.madhav.com.ipl2018.di.component.DaggerActivityComponent;
import com.madhav.com.ipl2018.di.module.ActivityModule;
import com.madhav.com.ipl2018.di.qualifier.CommentryQualifier;
import com.madhav.com.ipl2018.entity.Commentry;
import com.madhav.com.ipl2018.net.service.CommentryService;

import javax.inject.Inject;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by madhav on 4/11/2018.
 */

public class CommentryActivity extends AppCompatActivity implements Callback<Commentry> {
    RecyclerView recyclerView;
    @Inject
    @CommentryQualifier
    Retrofit retrofit;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getCommentryView());
        Intent intent = getIntent();
        String message = intent.getStringExtra("matchId");
        ActivityComponent activityComponent = DaggerActivityComponent.builder().activityModule(new ActivityModule(this))
                .build();
        activityComponent.inject(this);
        CommentryService commentryService = retrofit.create(CommentryService.class);
        Call<Commentry> commentry = commentryService.getCommentrys();
        commentry.enqueue(this);
    }


    public View getCommentryView() {
        recyclerView=new RecyclerView(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        return recyclerView;
    }


    @Override
    public void onResponse(Call<Commentry> call, Response<Commentry> response) {
        recyclerView.setAdapter(new CommentryAdapter(this,response.body().getCommentaries()));
    }

    @Override
    public void onFailure(Call<Commentry> call, Throwable t) {
        Toast.makeText(this, ""+t.getMessage().toString(), Toast.LENGTH_SHORT).show();
    }
}
