package com.example.Alfa29;

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

    public void showExit(View view) {
        Intent intent = new Intent(this,exitActivity.class);
        finish();
        startActivity(intent);
    }

    public void startGame(View view) {
        Intent intent = new Intent(this,linkStart.class);
        finish();
        startActivity(intent);
    }
}
