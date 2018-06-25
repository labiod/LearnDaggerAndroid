package com.kgb.firstdaggerapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.kgb.firstdaggerapp.presenter.MainPresenter;

import java.util.Observable;

import javax.inject.Inject;

import dagger.android.DaggerActivity;

public class MainActivity extends DaggerActivity implements MainView {
    @Inject
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter.loadMain();
    }

    @Override
    public void onMainLoaded() {
        Log.v("TEST", "Main page is loaded.");
    }
}
