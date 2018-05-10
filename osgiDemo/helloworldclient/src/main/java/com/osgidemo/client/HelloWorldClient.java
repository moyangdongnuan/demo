package com.osgidemo.client;

import com.osgidemo.api.IHelloWorldApi;

/**
 * Created by Administrator on 2018/5/3.
 */
public class HelloWorldClient {
    IHelloWorldApi iHelloWorldApi;
    public void echo(){
        iHelloWorldApi.say();
    }
    public void setiHelloWorldApi(IHelloWorldApi iHelloWorldApi){
        this.iHelloWorldApi=iHelloWorldApi;
    }
}
