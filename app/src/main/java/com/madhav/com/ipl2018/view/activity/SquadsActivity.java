package com.madhav.com.ipl2018.view.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import com.google.gson.Gson;

import java.io.IOException;

import javax.inject.Inject;

import com.madhav.com.ipl2018.R;
import com.madhav.com.ipl2018.di.component.ActivityComponent;
import com.madhav.com.ipl2018.di.component.DaggerActivityComponent;
import com.madhav.com.ipl2018.di.module.ActivityModule;
import com.madhav.com.ipl2018.di.qualifier.Datacdn;
import com.madhav.com.ipl2018.entity.Squad;
import com.madhav.com.ipl2018.net.service.CdnService;
import com.madhav.com.ipl2018.util.StringResponse;
import com.madhav.com.ipl2018.view.adapter.SquadAdapter;
import com.madhav.com.ipl2018.view.fragment.PlayersFragment;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by madhav on 4/10/2018.
 */

public class SquadsActivity extends AppCompatActivity implements Callback<ResponseBody>, SquadAdapter.SquadListener {
    @Inject
    @Datacdn
    Retrofit retrofit;
    private RelativeLayout relativeLayout;
    private FrameLayout frameLayout;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getView());
        ActivityComponent activityComponent = DaggerActivityComponent.builder().activityModule(new ActivityModule(this))
                .build();
        activityComponent.inject(this);
        CdnService cdnService = retrofit.create(CdnService.class);
        Call<ResponseBody> iplSquad = cdnService.getIPLSquad();
        iplSquad.enqueue(this);
    }

    public RelativeLayout getView() {
        relativeLayout = new RelativeLayout(this);
        relativeLayout.setId(R.id.squad_root);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
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

        recyclerView = new RecyclerView(this);
        relativeLayout.addView(recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutParams(new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        return relativeLayout;
    }

    @Override
    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
        frameLayout.setVisibility(View.GONE);
        try {
            String sjsonResponse = null;
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.KITKAT) {
                sjsonResponse = new StringResponse().getStringResponse(response.body().bytes());
            }
            Squad squad = new Gson().fromJson(sjsonResponse, Squad.class);
            SquadAdapter squadAdapter = new SquadAdapter(this, squad);
            recyclerView.setAdapter(squadAdapter);
            squadAdapter.setOnItemClickListener(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onFailure(Call<ResponseBody> call, Throwable t) {
        frameLayout.setVisibility(View.GONE);
    }


    @Override
    public void onItemClick(View view, int position, Squad.Squads squads) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Fragment fragment = PlayersFragment.newInstance(squads);
        ft.replace(R.id.squad_root, fragment);
        ft.commit();
    }
}
