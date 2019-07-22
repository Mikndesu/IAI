package com.example.i_a_i;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Bushi1_win extends AppCompatActivity {

    TextView bushi1win;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bushi1_win);

        bushi1win = findViewById(R.id.bushi1_win);
        bushi1win.setTextColor(Color.rgb(134, 213, 49));
    }

    public void exit(View v) {
    }

    public void re(View v) {
    }

}
