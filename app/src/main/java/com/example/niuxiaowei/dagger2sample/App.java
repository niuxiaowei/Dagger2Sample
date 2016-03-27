package com.example.niuxiaowei.dagger2sample;

import android.app.Application;

import com.example.niuxiaowei.dagger2sample.di.components.AppComponent;
import com.example.niuxiaowei.dagger2sample.di.components.DaggerAppComponent;
import com.example.niuxiaowei.dagger2sample.di.modules.AppModule;

/**
 * Created by niuxiaowei on 16/3/19.
 */
public class App extends Application {

    AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();

    }

    public AppComponent getAppComponent(){
        return mAppComponent;
    }
}
