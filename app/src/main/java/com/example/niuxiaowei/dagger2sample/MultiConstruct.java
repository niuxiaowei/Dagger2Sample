package com.example.niuxiaowei.dagger2sample;

import javax.inject.Inject;

/**
 *
 *  该类用来测试多个构造函数同时用@Inject进行标注，看dagger2是否能正常工作
 * Created by niuxiaowei on 16/3/24.
 */
public class MultiConstruct {

    @Inject
    MultiConstruct(){

    }
//
//    @Inject
//    MultiConstruct(int a){
//
//    }
//
//    @Inject
//    MultiConstruct(String s){
//
//    }

}
