package com.kgb.firstdaggerapp;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * @author Krzysztof Betlej <k.betlej@samsung.com>.
 * @date 4/11/18
 * @copyright Copyright (c) 2016 by Samsung Electronics Polska Sp. z o. o.
 */
@Module
public abstract class DaggerAppModule {
    @ContributesAndroidInjector
    abstract MainActivity contributeActivityInjector();
}
