package com.example.niuxiaowei.dagger2sample.di.components;

import android.app.Activity;

import com.example.niuxiaowei.dagger2sample.di.modules.ActivityModule;
import com.example.niuxiaowei.dagger2sample.di.scopes.PerActivity;
import com.example.niuxiaowei.dagger2sample.view.BaseActivity;

import dagger.Component;

/**
 *
 * Created by niuxiaowei on 16/3/20.
 */
@PerActivity
@Component(modules = {ActivityModule.class})
public interface ActivityComponent {

    Activity getActivity();
}
