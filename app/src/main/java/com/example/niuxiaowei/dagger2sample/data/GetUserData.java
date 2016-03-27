package com.example.niuxiaowei.dagger2sample.data;

import javax.inject.Inject;

/**
 * Created by niuxiaowei on 16/3/20.
 */
public class GetUserData {

    @Inject
    public GetUserData(){

    }

    public UserData getUser(){
        UserData data = new UserData();
        data.mUserName = "niu";
        return data;
    }
}
