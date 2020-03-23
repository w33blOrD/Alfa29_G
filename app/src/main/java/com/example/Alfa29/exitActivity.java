package com.example.Alfa29;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import static java.lang.System.exit;

public class exitActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exit);
    }

    public void exitApp(View view) {
        exit(0);
    }

    public void notExit(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        finish();
        startActivity(intent);
    }
}
