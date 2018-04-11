package com.madhav.com.ipl2018.di.component;

import android.content.Context;

import javax.inject.Singleton;

import com.madhav.com.ipl2018.app.IplIndia;
import com.madhav.com.ipl2018.di.module.AppModule;
import com.madhav.com.ipl2018.di.qualifier.ApplicationContext;
import dagger.Component;

/**
 * Created by madhav on 4/6/2018.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(IplIndia iplIndia);

    @ApplicationContext
    Context getIplContext();


}
