package com.example.niuxiaowei.dagger2sample.di.components;

import com.example.niuxiaowei.dagger2sample.di.scopes.PerActivity;
import com.example.niuxiaowei.dagger2sample.view.MainFragment;

import dagger.Subcomponent;

/**
 * Created by niuxiaowei on 16/3/20.
 */
@PerActivity
@Subcomponent
public interface MainFragmentComponent {


    void inject(MainFragment mainFragment);
}
