package com.madhav.com.ipl2018.di.module;

import android.os.Build;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.madhav.com.ipl2018.constants.BaseConstants;
import com.madhav.com.ipl2018.constants.iplUrls.IPLUrls;
import com.madhav.com.ipl2018.di.qualifier.ApiPlatform;
import com.madhav.com.ipl2018.di.qualifier.BrighCove;
import com.madhav.com.ipl2018.di.qualifier.CommentryQualifier;
import com.madhav.com.ipl2018.di.qualifier.DataCdnFull;
import com.madhav.com.ipl2018.di.qualifier.Datacdn;
import com.madhav.com.ipl2018.di.qualifier.VideoClient;

import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import dagger.Module;
import dagger.Provides;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
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

        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(200, TimeUnit.SECONDS)
                .writeTimeout(200, TimeUnit.SECONDS)
                .readTimeout(200, TimeUnit.SECONDS);
        OkHttpClient okHttpClient = builder.build();
        return okHttpClient;
    }

    @Provides
    @VideoClient
    public Map<String,String> provideOKHTTPHeaders() {

        Map<String, String> headers = new HashMap<>();
        headers.put("Accept", "application/json;pk=BCpkADawqM2gJr3ZcIhQ11I_StukGg3_84VrOyxRZLlZv6syus2x7Re2-xuSc1ITG3JcVHCKhGJ9Yq84PdJJT48S9i3mq-eUQN8HjoxxiIlkpnuBMlxHgAnqGf0BmpsuGOJDBuMIjuXItNfuPTsfj8x5L_J6bQ2ox5KvD4u9vbxfvUpWPNxwlPZACN7z7W2CYounaxo6evVMeUrd");
        headers.put("Accept-Encoding", "application/gzip,deflate,br");
        headers.put("Accept-Language", "en-US,en;q=0.5");
        headers.put("Connection", "keep-alive");
        headers.put("Host", "edge.api.brightcove.com");
        headers.put("Origin", "https://www.iplt20.com");
        headers.put("Referer", "https://www.iplt20.com/video/117887/we-were-ready-for-a-six-over-game-unadkat?tagNames=indian-premier-league");
        headers.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:59.0) Gecko/20100101 Firefox/59.0*");
        return headers;
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

    @Provides
    @BrighCove
    public Retrofit provideVideoBrighCove() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(200, TimeUnit.SECONDS)
                .writeTimeout(200, TimeUnit.SECONDS)
                .readTimeout(200, TimeUnit.SECONDS);

        OkHttpClient okHttpClient = builder.build();
        builder.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request();
                Request newRequest;
       /* Accept:application/json;pk=BCpkADawqM2gJr3ZcIhQ11I_StukGg3_84VrOyxRZLlZv6syus2x7Re2-xuSc1ITG3JcVHCKhGJ9Yq84PdJJT48S9i3mq-eUQN8HjoxxiIlkpnuBMlxHgAnqGf0BmpsuGOJDBuMIjuXItNfuPTsfj8x5L_J6bQ2ox5KvD4u9vbxfvUpWPNxwlPZACN7z7W2CYounaxo6evVMeUrd
        Accept-Encoding:application/gzip,deflate,br
        Accept-Language:en-US,en;q=0.5
        Connection:keep-alive
        Host:edge.api.brightcove.com
        Origin:https://www.iplt20.com
        (String.format(Locale.US,
        "%s/%s (Android %s; %s; %s %s; %s)",
        appName,
        appVersion,
        Build.VERSION.RELEASE,
        Build.MODEL,
        Build.BRAND,
        Build.DEVICE,
Locale.getDefault().getLanguage())
        Referer:https://www.iplt20.com/video/117887/we-were-ready-for-a-six-over-game-unadkat?tagNames=indian-premier-league
        User-Agent:Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:59.0) Gecko/20100101 Firefox/59.0*/
                newRequest = request.newBuilder()
                        .addHeader("Accept", "application/json;pk=BCpkADawqM2gJr3ZcIhQ11I_StukGg3_84VrOyxRZLlZv6syus2x7Re2-xuSc1ITG3JcVHCKhGJ9Yq84PdJJT48S9i3mq-eUQN8HjoxxiIlkpnuBMlxHgAnqGf0BmpsuGOJDBuMIjuXItNfuPTsfj8x5L_J6bQ2ox5KvD4u9vbxfvUpWPNxwlPZACN7z7W2CYounaxo6evVMeUrd")
                        .addHeader("Accept-Encoding", "application/gzip,deflate,br")
                        .addHeader("Accept-Language", "en-US,en;q=0.5")
                        .addHeader("Connection", "keep-alive")
                        .addHeader("Host", "edge.api.brightcove.com")
                        .addHeader("Origin", "https://www.iplt20.com")
                        .addHeader("Referer", "https://www.iplt20.com/video/117887/we-were-ready-for-a-six-over-game-unadkat?tagNames=indian-premier-league")
//                        .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:59.0) Gecko/20100101 Firefox/59.0*")
                        .addHeader("User-Agent", (String.format(Locale.US,
                                "%s/%s (Android %s; %s; %s %s; %s)",
                                "IPl2018",
                                "33",
                                Build.VERSION.RELEASE,
                                Build.MODEL,
                                Build.BRAND,
                                Build.DEVICE,
                                Locale.getDefault().getLanguage())))
                        .build();
                return chain.proceed(newRequest);
            }
        });
        Retrofit build = new Retrofit.Builder().client(okHttpClient).addConverterFactory(GsonConverterFactory.create()).baseUrl(BaseConstants.BASE_VIDEO_URL).build();
        return build;
    }
}
