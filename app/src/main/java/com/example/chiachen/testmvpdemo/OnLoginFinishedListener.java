package com.example.chiachen.testmvpdemo;

/**
 * Created by chiachen on 2016/11/29.
 */

public interface OnLoginFinishedListener {
    void onUsernameError();

    void onPasswordError();

    void onSuccess();
}
