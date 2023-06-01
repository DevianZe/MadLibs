package com.example.madlibs;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    TextView tvTopText;
    TextView tvBottomText;
    TextView tvStory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        String story = intent.getStringExtra("story");
        tvStory = findViewById(R.id.tv_story);
        tvStory.setText(story);

    }
}