package com.madhav.com.ipl2018.util;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.nio.charset.StandardCharsets;

/**
 * Created by madhav on 4/10/2018.
 */

public class StringResponse {

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public String getStringResponse(byte[] bytes) {
        String response = new String(bytes, StandardCharsets.UTF_8);
        response = response.substring(response.indexOf("(") + 1, response.lastIndexOf(")"));
        return response;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public String getStringForm(byte[] bytes) {
        String response = new String(bytes, StandardCharsets.UTF_8);
        return response;
    }
}
