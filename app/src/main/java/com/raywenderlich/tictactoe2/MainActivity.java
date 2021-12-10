package com.raywenderlich.tictactoe2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playButtonClick(View view){
        Intent intent = new Intent(MainActivity.this, PlayerSetup.class);
        intent.putExtra("game", 1);
        startActivity(intent);
    }

    public void playCompButtonClick(View view){
        Intent intent = new Intent(MainActivity.this, PlayerSetup.class);
        intent.putExtra("game", 2);
        startActivity(intent);
    }

}