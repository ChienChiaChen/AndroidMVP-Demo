package com.example.chiachen.testmvpdemo;

/**
 * Created by chiachen on 2016/11/30.
 */

public interface LoginPresenter {
    void validateCredentials(String username, String password);

    void onDestroy();
}
