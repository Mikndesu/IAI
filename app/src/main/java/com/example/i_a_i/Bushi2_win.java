package com.example.i_a_i;

import android.graphics.Color;
import android.os.Process;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Bushi2_win extends AppCompatActivity {

    TextView bushi2_win;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bushi2_win);

        bushi2_win = findViewById(R.id.bushi2_win);
        bushi2_win.setTextColor(Color.rgb(134,224,89));
    }

    public void quit(View v) {
    }

    public void re(View v) {

    }
}
