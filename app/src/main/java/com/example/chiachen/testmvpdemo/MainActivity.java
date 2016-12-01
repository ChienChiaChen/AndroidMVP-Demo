package com.example.chiachen.testmvpdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements LoginView, View.OnClickListener{
    private ProgressBar progressBar;
    private EditText username;
    private EditText password;
    private LoginPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = (ProgressBar) findViewById(R.id.progress);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        findViewById(R.id.button).setOnClickListener(this);
        presenter = new LoginPresenterImpl(this);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void setUsernameError() {
        username.setError("username_error");
    }

    @Override
    public void setPasswordError() {
        password.setError("username_error");
    }

    @Override
    public void navigateToHome() {
        Toast.makeText(this,"login success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        String uuuuu = username.getText().toString();
        String paswwwww = password.getText().toString();

        presenter.validateCredentials(uuuuu, paswwwww);

    }
}
