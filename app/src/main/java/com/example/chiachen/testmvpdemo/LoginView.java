package com.example.chiachen.testmvpdemo;

/**
 * Created by chiachen on 2016/11/29.
 */

public interface LoginView {
    void showProgress();

    void hideProgress();

    void setUsernameError();

    void setPasswordError();

    void navigateToHome();
}
