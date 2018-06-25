package com.kgb.firstdaggerapp.module;

import android.app.Activity;

import com.kgb.firstdaggerapp.MainActivity;
import com.kgb.firstdaggerapp.component.MainActivityComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * @author Krzysztof Betlej <k.betlej@samsung.com>.
 * @date 4/13/18
 * @copyright Copyright (c) 2016 by Samsung Electronics Polska Sp. z o. o.
 */
@Module
public abstract class ActivityBuilder {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivity(MainActivityComponent.Builder builder);

}
