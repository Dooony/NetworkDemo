package com.example.networkdemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setButtons();

    }

    public void setButtons(){

        findViewById(R.id.launchWebButton).setOnClickListener(view -> {startActivity(
                new Intent(MainActivity.this, LaunchWebActivity.class));});

        findViewById(R.id.launchWebView).setOnClickListener(view -> {startActivity(
                new Intent(MainActivity.this, WebViewActivity.class));});

        findViewById(R.id.launchWebService).setOnClickListener(view -> {startActivity(
                new Intent(MainActivity.this, WebServiceActivity.class));});

        findViewById(R.id.launchNetworkInfo).setOnClickListener(view -> {startActivity(
                new Intent(MainActivity.this, NetworkInfoActivity.class));});


    }

}