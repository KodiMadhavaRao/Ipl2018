package com.madhav.com.ipl2018.di.component;

import android.content.Context;

import javax.inject.Singleton;

import com.madhav.com.ipl2018.di.module.ActivityModule;
import com.madhav.com.ipl2018.di.module.NetModule;
import com.madhav.com.ipl2018.di.qualifier.ActivityContext;
import com.madhav.com.ipl2018.view.activity.CommentryActivity;
import com.madhav.com.ipl2018.view.activity.CompletedMatchActivity;
import com.madhav.com.ipl2018.view.activity.HomeActivity;
import com.madhav.com.ipl2018.view.activity.ImagesActivity;
import com.madhav.com.ipl2018.view.activity.MainActivity;
import com.madhav.com.ipl2018.view.activity.PointsTableActivity;
import com.madhav.com.ipl2018.view.activity.SquadsActivity;
import com.madhav.com.ipl2018.view.activity.VideoActivity;
import dagger.Component;

/**
 * Created by madhav on 4/9/2018.
 */
@Singleton
@Component(modules = {ActivityModule.class, NetModule.class})
public interface ActivityComponent {
    @ActivityContext
    Context getIplActivityContext();

    void inject(MainActivity mainActivity);

    void inject(SquadsActivity mainActivity);

    void inject(HomeActivity homeActivity);

    void inject(VideoActivity videoActivity);

    void inject(PointsTableActivity pointsTableActivity);
    void inject(CommentryActivity commentryActivity);
    void inject(CompletedMatchActivity completedMatchActivity);
    void inject(ImagesActivity imagesActivity);


}
