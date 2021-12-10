package com.raywenderlich.tictactoe2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameDisplay extends AppCompatActivity {
    private Button playAgainButton, homeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_display);

        playAgainButton = findViewById(R.id.playAgainButton);
        homeButton = findViewById(R.id.homeButton);

    }

    public void playAgainButtonClick(View view){
        //
    }

    public void homeButtonClick(View view){
        Intent intent = new Intent(GameDisplay.this, MainActivity.class);
        startActivity(intent);
    }

}