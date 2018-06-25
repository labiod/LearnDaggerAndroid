package com.kgb.firstdaggerapp.component;

import com.kgb.firstdaggerapp.MainActivity;
import com.kgb.firstdaggerapp.module.MainActivityModule;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = MainActivityModule.class)
public interface MainActivityComponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity>{}
}
