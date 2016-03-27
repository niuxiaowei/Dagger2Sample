package com.example.niuxiaowei.dagger2sample.view;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import com.example.niuxiaowei.dagger2sample.App;
import com.example.niuxiaowei.dagger2sample.di.components.AppComponent;
import com.example.niuxiaowei.dagger2sample.di.components.DaggerActivityComponent;
import com.example.niuxiaowei.dagger2sample.di.modules.ActivityModule;

/**
 * Created by niuxiaowei on 16/3/20.
 */
public class BaseActivity extends AppCompatActivity {

    public AppComponent getAppComponent(){
        return ((App)getApplication()).getAppComponent();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
