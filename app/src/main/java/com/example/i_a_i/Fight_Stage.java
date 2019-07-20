package com.example.i_a_i;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Fight_Stage extends AppCompatActivity {

    Handler handler;

    ImageView fight;

    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight__stage);

        fight = findViewById(R.id.fight);

        fight.setVisibility(View.INVISIBLE);

        handler = new Handler();

        Intent intent = getIntent();
        int the_time = intent.getIntExtra("Seconds", 0);
        Random random = new Random();
        count = random.nextInt(the_time) + 1;

        Timer timer = new Timer(false);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        if (count > 0) {
                            count--;
                        } else if (count == 0) {
                            fight.setVisibility(View.VISIBLE);
                        }
                    }
                });
            }
        }, 0, 1000);

    }
}
