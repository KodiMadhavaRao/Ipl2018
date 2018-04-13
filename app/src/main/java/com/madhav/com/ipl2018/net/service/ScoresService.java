package com.madhav.com.ipl2018.net.service;

import com.madhav.com.ipl2018.entity.Scoring;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by madhav on 4/12/2018.
 */

public interface ScoresService {
    @GET("/fixtures/{match_id}/scoring/")
    public Call<Scoring> getScoring(@Path(value = "match_id", encoded = true) int matchId);
}
