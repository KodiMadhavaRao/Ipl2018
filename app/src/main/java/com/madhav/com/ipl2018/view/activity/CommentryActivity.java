package com.madhav.com.ipl2018.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.widget.Toast;

import com.madhav.com.ipl2018.R;
import com.madhav.com.ipl2018.di.component.ActivityComponent;
import com.madhav.com.ipl2018.di.component.DaggerActivityComponent;
import com.madhav.com.ipl2018.di.module.ActivityModule;
import com.madhav.com.ipl2018.di.qualifier.CommentryQualifier;
import com.madhav.com.ipl2018.entity.Commentry;
import com.madhav.com.ipl2018.net.service.CommentryService;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by madhav on 4/11/2018.
 */

public class CommentryActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener {
    @Inject
    @CommentryQualifier
    Retrofit retrofit;
    private TextView matchName;
    private TextView matchCount;
    private RecyclerView recyclerView;
    private SwipeRefreshLayout mSwipeRefreshLayout;
    private String message;
    private int pageNo = 1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.commentry_main);
        matchName = (TextView) findViewById(R.id.match_commentry_name);
        matchCount = (TextView) findViewById(R.id.match_count);
        recyclerView = (RecyclerView) findViewById(R.id.comentry_recycler);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        mLayoutManager.setReverseLayout(true);
        mLayoutManager.setStackFromEnd(true);
        recyclerView.setLayoutManager(mLayoutManager);
        // SwipeRefreshLayout
        mSwipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_container);
        mSwipeRefreshLayout.setOnRefreshListener(this);
        mSwipeRefreshLayout.setColorSchemeResources(R.color.colorPrimary,
                android.R.color.holo_green_dark,
                android.R.color.holo_orange_dark,
                android.R.color.holo_blue_dark);

        /**
         * Showing Swipe Refresh animation on activity create
         * As animation won't start on onCreate, post runnable is used
         */
        mSwipeRefreshLayout.post(new Runnable() {

            @Override
            public void run() {

                mSwipeRefreshLayout.setRefreshing(true);

                // Fetching data from server
                loadRecyclerViewData(pageNo);
            }
        });
        Intent intent = getIntent();
        message = intent.getStringExtra("matchId");
        ActivityComponent activityComponent = DaggerActivityComponent.builder().activityModule(new ActivityModule(this))
                .build();
        activityComponent.inject(this);

    }


    @Override
    public void onRefresh() {
        pageNo = pageNo + 1;
        loadRecyclerViewData(pageNo);
    }

    private void loadRecyclerViewData(int page) {
        // Showing refresh animation before making http call
        mSwipeRefreshLayout.setRefreshing(true);
        CommentryService commentryService = retrofit.create(CommentryService.class);
        Call<Commentry> commentry = commentryService.getCommentry(message, page);
        commentry.enqueue(new Callback<Commentry>() {
            @Override
            public void onResponse(Call<Commentry> call, Response<Commentry> response) {
                if (response.body() != null) {
                    Commentry body = response.body();
                    matchName.setText(body.getMatchId().getName());
                    matchCount.setText(body.getMatchId().getMatchIdName());
                    if (pageNo > 1) {
                        CommentryAdapter adapter = (CommentryAdapter) recyclerView.getAdapter();
                        adapter.setData(body.getCommentaries());
                        adapter.notifyDataSetChanged();


                    } else {

                        recyclerView.setAdapter(new CommentryAdapter(CommentryActivity.this, body.getCommentaries()));
                    }
                    mSwipeRefreshLayout.setRefreshing(false);
                } else {
                    mSwipeRefreshLayout.setRefreshing(false);
                    Toast.makeText(CommentryActivity.this, "Match is Completed", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<Commentry> call, Throwable t) {
                mSwipeRefreshLayout.setRefreshing(false);
                Toast.makeText(CommentryActivity.this, "" + t.getMessage().toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
