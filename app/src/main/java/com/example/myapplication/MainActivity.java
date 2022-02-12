package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleText(View v) {
        EditText t = findViewById(R.id.source);
        String input = t.getText().toString();
        ((TextView) findViewById(R.id.output)).setText(input);
        Log.d("info", input);
    }

}