package com.madhav.com.ipl2018.net.service;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by madhav on 4/12/2018.
 */

public class BrighCoveIntercept implements Interceptor {
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
                .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:59.0) Gecko/20100101 Firefox/59.0*")
                .build();
        return chain.proceed(newRequest);
    }
}
