package com.kgb.firstdaggerapp.module;

import android.app.Application;
import android.content.Context;

import com.kgb.firstdaggerapp.DaggerApp;
import com.kgb.firstdaggerapp.component.AppComponent;
import com.kgb.firstdaggerapp.component.MainActivityComponent;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import dagger.Provides;

/**
 * @author Krzysztof Betlej <k.betlej@samsung.com>.
 * @date 4/13/18
 * @copyright Copyright (c) 2016 by Samsung Electronics Polska Sp. z o. o.
 */
@Module(subcomponents = {
        MainActivityComponent.class
        })
public class AppModule {
    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application;
    }

}
