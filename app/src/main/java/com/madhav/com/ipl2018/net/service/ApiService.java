package com.madhav.com.ipl2018.net.service;

import com.madhav.com.ipl2018.entity.VideoThumb;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by madhav on 4/9/2018.
 */

public interface ApiService {
    @GET("/content/ipl/VIDEO/en?page=0&pageSize=15&tagNames=indian-premier-league&detail=DETAILED")
    public Call<VideoThumb> getVideoThumb();
}
