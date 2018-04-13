package com.madhav.com.ipl2018.net.service;

import com.madhav.com.ipl2018.constants.iplUrls.IPLUrls;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by madhav on 4/9/2018.
 */

public interface CdnService {
    @GET(IPLUrls.TABLE)
    public Call<ResponseBody> getTableValues();

    @GET(IPLUrls.SQUAD)
    public Call<ResponseBody> getIPLSquad();
}
