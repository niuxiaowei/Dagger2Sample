package com.example.niuxiaowei.dagger2sample.di.components;

import com.example.niuxiaowei.dagger2sample.di.modules.ActivityModule;
import com.example.niuxiaowei.dagger2sample.di.modules.MainModule;
import com.example.niuxiaowei.dagger2sample.di.scopes.PerActivity;
import com.example.niuxiaowei.dagger2sample.view.MainActivity;

import dagger.Component;

/**
 * MainComponent继承了ActivityComponent，假如ActivityComponent中定义了创建类实例方法，则MainComponent中必须提供@Inject或@Provides对应的
 * 初始化类实例的方法
 * Created by niuxiaowei on 16/3/20.
 */
@PerActivity
@Component(dependencies = AppComponent.class,modules = {MainModule.class, ActivityModule.class})
public interface MainComponent extends ActivityComponent{
    //对MainActivity进行依赖注入
    void inject(MainActivity mainActivity);


    MainFragmentComponent mainFragmentComponent();
}
