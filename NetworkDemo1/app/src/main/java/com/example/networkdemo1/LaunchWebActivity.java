package com.example.networkdemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LaunchWebActivity extends AppCompatActivity {

    private EditText mUrlEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_web);

        mUrlEditText = findViewById(R.id.web_dest_edit_text);
    }

    public void launchWeb(View view){}

}