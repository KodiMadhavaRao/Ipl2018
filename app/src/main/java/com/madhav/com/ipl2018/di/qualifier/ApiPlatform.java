package com.madhav.com.ipl2018.di.qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by madhav on 4/9/2018.
 */

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiPlatform {
}
