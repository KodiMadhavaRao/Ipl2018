package com.madhav.com.ipl2018.di.module;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import com.madhav.com.ipl2018.constants.BaseConstants;
import com.madhav.com.ipl2018.constants.iplUrls.IPLUrls;
import com.madhav.com.ipl2018.di.qualifier.ApiPlatform;
import com.madhav.com.ipl2018.di.qualifier.CommentryQualifier;
import com.madhav.com.ipl2018.di.qualifier.DataCdnFull;
import com.madhav.com.ipl2018.di.qualifier.Datacdn;

import java.util.concurrent.TimeUnit;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by madhav on 4/9/2018.
 */
@Module
public class NetModule {
    public NetModule() {
    }

    @Provides
    public OkHttpClient provideOKHTTPClient() {
        OkHttpClient okHttpClient = new OkHttpClient();
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(5, TimeUnit.MINUTES)
                .writeTimeout(5, TimeUnit.MINUTES)
                .readTimeout(5, TimeUnit.MINUTES);

        okHttpClient = builder.build();
        return okHttpClient;
    }

    @Provides
    @ApiPlatform
    public Retrofit provideRetrofitAPI(OkHttpClient okHttpClient) {

        Retrofit build = new Retrofit.Builder().client(okHttpClient).addConverterFactory(GsonConverterFactory.create()).baseUrl(BaseConstants.BASE_API_URL).build();
        return build;
    }

    @Provides
    @Datacdn
    public Retrofit provideRetrofitCdn(OkHttpClient okHttpClient) {
        Retrofit build = new Retrofit.Builder().client(okHttpClient).addConverterFactory(GsonConverterFactory.create()).baseUrl(IPLUrls.BASE_URL).build();
        return build;
    }

    @Provides
    @DataCdnFull
    public Retrofit provideRetrofitCdnFull(OkHttpClient okHttpClient) {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        Retrofit build = new Retrofit.Builder().client(okHttpClient).addConverterFactory(GsonConverterFactory.create(gson)).baseUrl(IPLUrls.BASE_FULL).build();
        return build;
    }
    @Provides
    @CommentryQualifier
    public Retrofit provideRetrofitCommenry(OkHttpClient okHttpClient) {
        Retrofit build = new Retrofit.Builder().client(okHttpClient).addConverterFactory(GsonConverterFactory.create()).baseUrl(BaseConstants.BASE_COMMENTRY_URL).build();
        return build;
    }
}
