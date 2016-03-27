package com.example.niuxiaowei.dagger2sample.view;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.niuxiaowei.dagger2sample.R;
import com.example.niuxiaowei.dagger2sample.di.components.DaggerMainComponent;
import com.example.niuxiaowei.dagger2sample.di.components.MainComponent;
import com.example.niuxiaowei.dagger2sample.di.modules.ActivityModule;
import com.example.niuxiaowei.dagger2sample.di.modules.MainModule;

public class MainActivity extends BaseActivity implements MainFragment.OnFragmentInteractionListener{

    private MainComponent mMainComponent;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMainComponent = DaggerMainComponent.builder().appComponent(getAppComponent())
                .mainModule(new MainModule())
                .activityModule(new ActivityModule(this)).build();
        mMainComponent.inject(this);
    }

    public MainComponent getMainComponent(){
        return mMainComponent;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

}
