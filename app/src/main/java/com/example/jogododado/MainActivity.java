package com.example.jogododado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView playGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        playGame = findViewById(R.id.play_game);

        playGame.setOnClickListener(v -> {

            Intent intent = new Intent(MainActivity.this,ScreenGame.class);
            startActivity(intent);

        });


    }

}