package com.kgb.firstdaggerapp.presenter;

import com.kgb.firstdaggerapp.ApiService;
import com.kgb.firstdaggerapp.MainView;

import javax.inject.Inject;

/**
 * @author Krzysztof Betlej <k.betlej@samsung.com>.
 * @date 4/13/18
 * @copyright Copyright (c) 2016 by Samsung Electronics Polska Sp. z o. o.
 */
public class MainPresenterImpl implements MainPresenter {
    MainView mainView;
    ApiService apiService;

    @Inject
    public MainPresenterImpl(MainView mainView, ApiService apiService) {
        this.mainView = mainView;
        this.apiService = apiService;
    }

    public void loadMain(){
        apiService.loadData();
        mainView.onMainLoaded();
    }
}
