package com.prateek.demoproguardproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String first = "1";
    String second = "2";
    String third = "3";
    String forth = "4";
    String result = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = first + second + third + forth;

        Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();
    }
}
