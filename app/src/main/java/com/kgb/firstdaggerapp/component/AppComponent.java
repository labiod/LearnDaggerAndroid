package com.kgb.firstdaggerapp.component;

import android.app.Application;

import com.kgb.firstdaggerapp.DaggerApp;
import com.kgb.firstdaggerapp.module.ActivityBuilder;
import com.kgb.firstdaggerapp.module.AppModule;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * @author Krzysztof Betlej <k.betlej@samsung.com>.
 * @date 4/13/18
 * @copyright Copyright (c) 2016 by Samsung Electronics Polska Sp. z o. o.
 */
@Component(modules = {
        AndroidInjectionModule.class,
        AppModule.class,
        ActivityBuilder.class
})
public interface AppComponent extends AndroidInjector<DaggerApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application app);
        AppComponent build();
    }

    void inject(DaggerApp application);
}
