package com.madhav.com.ipl2018.app;

import android.app.Application;
import android.content.Context;

import javax.inject.Inject;

import com.madhav.com.ipl2018.di.component.AppComponent;
import com.madhav.com.ipl2018.di.component.DaggerAppComponent;
import com.madhav.com.ipl2018.di.module.AppModule;
import com.madhav.com.ipl2018.di.qualifier.ApplicationContext;

/**
 * Created by madhav on 4/6/2018.
 */

public class IplIndia extends Application {
    AppComponent appComponent;
    @Inject
    @ApplicationContext
    Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
        appComponent.inject(this);
//        TypefaceUtil.overrideFont(getApplicationContext(), "CaviarDreams", "fonts/CreditValley.ttf"); // font from assets: "assets/fonts/Roboto-Regular.ttf
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
