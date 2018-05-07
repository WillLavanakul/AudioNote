package com.example.slimj.audionote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.google.api.services.youtube.YouTube;
import com.google.common.collect.Lists;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    List<String> scopes = Lists.newArrayList("https://www.googleapis.com/auth/youtube.force-ssl");

}
