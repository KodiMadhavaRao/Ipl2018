package com.madhav.com.ipl2018.view.activity;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.Toast;

import javax.inject.Inject;

import com.google.gson.Gson;
import com.madhav.com.ipl2018.R;
import com.madhav.com.ipl2018.di.component.ActivityComponent;
import com.madhav.com.ipl2018.di.component.DaggerActivityComponent;
import com.madhav.com.ipl2018.di.module.ActivityModule;
import com.madhav.com.ipl2018.di.qualifier.ActivityContext;
import com.madhav.com.ipl2018.di.qualifier.ApiPlatform;
import com.madhav.com.ipl2018.di.qualifier.BrighCove;
import com.madhav.com.ipl2018.di.qualifier.VideoClient;
import com.madhav.com.ipl2018.entity.Scoring;
import com.madhav.com.ipl2018.entity.VideoThumb;
import com.madhav.com.ipl2018.entity.VideoUrls;
import com.madhav.com.ipl2018.net.service.ApiService;
import com.madhav.com.ipl2018.net.service.VideoService;
import com.madhav.com.ipl2018.util.StringResponse;
import com.madhav.com.ipl2018.view.adapter.VideoAdapter;
import com.madhav.com.ipl2018.view.fragment.VideoPlayerFragment;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;
import okhttp3.internal.http.RealResponseBody;
import okio.Buffer;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by madhav on 4/9/2018.
 */

public class VideoActivity extends AppCompatActivity implements Callback<VideoThumb>,VideoAdapter.VideoListener {
    @Inject
    @ActivityContext
    Context context;
    @Inject
    @ApiPlatform
    Retrofit retrofit;
    @Inject
    @VideoClient
    Map<String ,String > headers;
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
        VideoAdapter videoAdapter = new VideoAdapter(this, videoThumb);
        videoAdapter.setOnItemClickListener(this);
        recyclerView.setAdapter(videoAdapter);

    }

    @Override
    public void onFailure(Call<VideoThumb> call, Throwable t) {

    }

    @Override
    public void onVideoItemClickListener(View view, int iPosition, String sVideoId) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        Headers headerbuild = Headers.of(headers);
        builder.connectTimeout(200, TimeUnit.SECONDS)
                .writeTimeout(200, TimeUnit.SECONDS)
                .readTimeout(200, TimeUnit.SECONDS);
        Request request = new Request.Builder().url("https://edge.api.brightcove.com/playback/v1/accounts/3588749423001/videos/"+sVideoId).headers(headerbuild).build();

        OkHttpClient client = new OkHttpClient();
        okhttp3.Response response = null;
            okhttp3.Call call = client.newCall(request);
            call.enqueue(new okhttp3.Callback() {
                @Override
                public void onFailure(okhttp3.Call call, IOException e) {

                }

                @TargetApi(Build.VERSION_CODES.KITKAT)
                @Override
                public void onResponse(okhttp3.Call call, okhttp3.Response response) throws IOException {
                    byte[] bytes1 = response.body().bytes();
                    String stringResponse = new StringResponse().getStringForm(bytes1);
                    VideoUrls videoUrls = new Gson().fromJson(stringResponse, VideoUrls.class);
                    String videoUrl = videoUrls.getSources().get(1).getSrc();
                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    VideoPlayerFragment videoPlayerFragment = VideoPlayerFragment.newInstance(videoUrl);
                    ft.replace(R.id.videos_list_root,videoPlayerFragment);
                    ft.commit();

                }
            });


    }

}
