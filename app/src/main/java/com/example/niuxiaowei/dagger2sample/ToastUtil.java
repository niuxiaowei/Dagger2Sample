package com.example.niuxiaowei.dagger2sample;

import android.content.Context;
import android.widget.Toast;

import javax.inject.Inject;

/**
 * 管理toast的类，整个app用该类来显示toast
 * Created by niuxiaowei on 16/3/22.
 */
public class ToastUtil {

    private Context mContext;

    public ToastUtil(Context context){
        this.mContext = context;
    }

    public void showToast(String message){
        Toast.makeText(mContext,message,Toast.LENGTH_LONG).show();
    }


}
