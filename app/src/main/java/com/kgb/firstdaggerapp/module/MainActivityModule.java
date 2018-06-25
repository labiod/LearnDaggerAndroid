package com.kgb.firstdaggerapp.module;

import com.kgb.firstdaggerapp.ApiService;
import com.kgb.firstdaggerapp.MainActivity;
import com.kgb.firstdaggerapp.MainView;
import com.kgb.firstdaggerapp.presenter.MainPresenter;
import com.kgb.firstdaggerapp.presenter.MainPresenterImpl;

import dagger.Module;
import dagger.Provides;

/**
 * @author Krzysztof Betlej <k.betlej@samsung.com>.
 * @date 4/13/18
 * @copyright Copyright (c) 2016 by Samsung Electronics Polska Sp. z o. o.
 */
@Module
public class MainActivityModule {

    @Provides
    MainView provideMainView(MainActivity mainActivity){
        return mainActivity;
    }

    @Provides
    MainPresenter provideMainPresenter(MainView mainView, ApiService apiService){
        return new MainPresenterImpl(mainView, apiService);
    }
}
