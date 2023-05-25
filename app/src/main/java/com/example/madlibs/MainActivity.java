package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etName;
    EditText etNoun;
    EditText etAdjective;
    EditText etColor;
    EditText etFruit;
    EditText etMusicArtist;
    EditText etVerb;
    EditText etCelebrity;
    EditText etSong;
    EditText etTvShow;

    Button btnGenerate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.et_name);
        etNoun = findViewById(R.id.et_noun);
        etAdjective = findViewById(R.id.et_adjective);
        etColor = findViewById(R.id.et_Color);
        etFruit = findViewById(R.id.et_fruit);
        etMusicArtist = findViewById(R.id.et_musicArtist);
        etVerb = findViewById(R.id.et_verb);
        etCelebrity = findViewById(R.id.et_celebrity);
        etSong = findViewById(R.id.et_song);
        etTvShow = findViewById(R.id.et_tvShow);

        Intent secondActivity = new Intent(MainActivity.this, SecondActivity.class);
        String sendThisString = "Whatever string I want to send";
        String sendThisTo = "The other string I want to send";
        secondActivity.putExtra("data1",sendThisString);
        secondActivity.putExtra("data2",sendThisTo);
        String story = "The Great Adventure!";


        secondActivity.putExtra("story",story);

        startActivity(secondActivity);
    }
}