package com.example.chiachen.testmvpdemo;

/**
 * Created by chiachen on 2016/11/29.
 */

public interface LoginModel {
    void login(String username, String password, OnLoginFinishedListener listener);

}
