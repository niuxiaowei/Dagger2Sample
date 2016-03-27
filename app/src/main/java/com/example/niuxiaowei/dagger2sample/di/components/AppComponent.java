package com.example.niuxiaowei.dagger2sample.di.components;

import android.content.Context;

import dagger.Component;

import com.example.niuxiaowei.dagger2sample.Navigator;
import com.example.niuxiaowei.dagger2sample.ToastUtil;
import com.example.niuxiaowei.dagger2sample.di.modules.AppModule;

import javax.inject.Singleton;

/**
 * Created by niuxiaowei on 16/3/19.
 */
@Singleton
@Component(modules={AppModule.class})
public interface AppComponent {

    Context getContext();

    Navigator getNavigator();
    ToastUtil getToastUtil();
//    Test test();

}
