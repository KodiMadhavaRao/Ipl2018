package com.madhav.com.ipl2018.net.service;

import com.madhav.com.ipl2018.entity.Commentry;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by madhav on 4/11/2018.
 */

public interface CommentryService {
    @GET("/fixtures/{match_id}/commentary/feeds/{page}?customer=bcci")
    public Call<Commentry> getCommentry(@Path(value = "match_id", encoded = true) String matchId, @Path(value = "page", encoded = true) int page);

    @GET("/fixtures/7899/commentary/feeds/1?customer=bcci")
    public Call<Object> getCommentrys();
}
