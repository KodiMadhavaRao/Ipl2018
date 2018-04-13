package com.madhav.com.ipl2018.di.module;

import android.content.Context;

import com.madhav.com.ipl2018.di.qualifier.ApplicationContext;

import dagger.Module;
import dagger.Provides;

/**
 * Created by madhav on 4/6/2018.
 */
@Module
public class AppModule {
    private Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @Provides
    @ApplicationContext
    public Context getIPLApplicationContext() {
        return context;
    }
}
