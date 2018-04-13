package com.madhav.com.ipl2018.net.service;

import com.madhav.com.ipl2018.entity.Scoring;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by madhav on 4/12/2018.
 */

public interface VideoService {
    @GET("/playback/v1/accounts/3588749423001/videos/{match_id}")
    public Call<Scoring> getVideoData(@Path(value = "match_id", encoded = true) String matchId);
}
