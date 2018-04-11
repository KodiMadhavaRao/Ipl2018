package com.madhav.com.ipl2018.di.module;

import android.content.Context;

import com.madhav.com.ipl2018.di.qualifier.ActivityContext;
import dagger.Module;
import dagger.Provides;

/**
 * Created by madhav on 4/9/2018.
 */
@Module
public class ActivityModule {
    private Context context;

    public ActivityModule(Context context) {
        this.context = context;
    }

    @Provides
    @ActivityContext
    public Context getIPLActivityContext() {
        return context;
    }
}
