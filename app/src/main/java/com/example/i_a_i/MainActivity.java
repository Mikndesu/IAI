package com.example.i_a_i;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    int second = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View v) {
        if (second != 0) {
            Intent intent = new Intent(this, Fight_Stage.class);
            intent.putExtra("Seconds", second);
            startActivity(intent);
        }
    }

    public void three(View v) {
        second = 3;
    }

    public void five(View v) {
        second = 5;
    }

    public void ten(View v) {
        second = 10;
    }
}
