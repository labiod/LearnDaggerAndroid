package com.kgb.firstdaggerapp;

import android.app.Activity;
import android.app.Application;

import com.kgb.firstdaggerapp.component.AppComponent;
import com.kgb.firstdaggerapp.component.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * @author Krzysztof Betlej <k.betlej@samsung.com>.
 * @date 4/11/18
 * @copyright Copyright (c) 2016 by Samsung Electronics Polska Sp. z o. o.
 */
public class DaggerApp extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        AppComponent appComponent = DaggerAppComponent.builder().application(this).build();
        appComponent.inject(this);
        return appComponent;
    }
}
