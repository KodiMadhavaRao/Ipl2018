package com.madhav.com.ipl2018.net.service;

import com.madhav.com.ipl2018.entity.ImagesOfMatch;
import com.madhav.com.ipl2018.entity.VideoThumb;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by madhav on 4/9/2018.
 */

public interface ApiService {
    @GET("/content/ipl/VIDEO/en?pageSize=15&tagNames=indian-premier-league&detail=DETAILED")
    public Call<VideoThumb> getVideoThumb(@Query("page") int pageNo);

    @GET("/content/ipl/photo/EN/?tags=gallery-photo&pageSize=150")
    public Call<ImagesOfMatch> getImages(@Query("references") String pid);
}
