package com.example.i_a_i;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class Fight_Stage extends AppCompatActivity {

//    Handler handler;
//
//    ImageView fight;
//
//    Timer timer = new Timer(false);
//
//    Button B_bushi1, B_bushi2;
//
//    int count;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_fight__stage);
//
//        fight = findViewById(R.id.fight);
//
//        B_bushi1 = findViewById(R.id.bushi1);
//
//        B_bushi2 = findViewById(R.id.bushi2);
//
//        fight.setVisibility(View.INVISIBLE);
//
//        handler = new Handler();
//
//        Intent intent = getIntent();
//        int the_time = intent.getIntExtra("Seconds", 0);
//        Random random = new Random();
//        count = random.nextInt(the_time) + 1;
//
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                handler.post(new Runnable() {
//                    @Override
//                    public void run() {
//                        if (count > 0) {
//                            count--;
//                        } else if (count == 0) {
//                            fight.setVisibility(View.VISIBLE);
//                            B_bushi1.setOnClickListener(new View.OnClickListener() {
//                                @Override
//                                public void onClick(View v) {
//                                    timer.cancel();
//                                    Intent_Bushi1();
//                                }
//                            });
//
//                            B_bushi2.setOnClickListener(new View.OnClickListener() {
//                                @Override
//                                public void onClick(View v) {
//                                    timer.cancel();
//                                    Intent_Bushi2();
//                                }
//                            });
//                        }
//                    }
//                });
//            }
//        }, 0, 1000);
//
//    }
//
//    public void Intent_Bushi1() {
//        Intent intent = new Intent(this, Bushi1_win.class);
//        startActivity(intent);
//    }
//
//    public void Intent_Bushi2() {
//        Intent intent = new Intent(this, Bushi2_win.class);
//        startActivity(intent);
//    }

    //A Flag of the fazes
    //default = -1, when fighting = 0, when one of them winning = 1

    private static int j;

    int flag = -1;

    Timer timer = new Timer(false);

    Handler handler;

    ImageView fight, bushi1, bushi2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight__stage);

        fight = findViewById(R.id.fight);
        bushi1 = findViewById(R.id.win);
        bushi2 = findViewById(R.id.lose);

        fight.setVisibility(View.INVISIBLE);
        bushi1.setVisibility(View.INVISIBLE);
        bushi2.setVisibility(View.INVISIBLE);



        Intent intent = getIntent();

        gametimer(intent.getIntExtra("Second", 0));

    }


    public void bushi1(View v) {

        if (flag == 0) {
            timer.cancel();
            System.out.println("Bushi1 Won!");
            bushi1.setVisibility(View.VISIBLE);
            bushi2.setVisibility(View.VISIBLE);
            fight.setVisibility(View.INVISIBLE);
        }

    }

    @SuppressLint("ResourceType")
    public void bushi2(View v) {

        if (flag == 0) {
            timer.cancel();
            System.out.println("Bushi2 Won!");
            bushi1.setImageResource(R.drawable.lose);
            bushi2.setImageResource(R.drawable.win);
            bushi1.setVisibility(View.VISIBLE);
            bushi2.setVisibility(View.VISIBLE);
            fight.setVisibility(View.INVISIBLE);
        }

    }

    public void gametimer(int i) {

        j = i;

        handler = new Handler();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        if (j > 0) {
                            j = j - 1;
                            System.out.println(j);
                        } else if (j == 0) {
                            fight.setVisibility(View.VISIBLE);
                            flag = 0;
                        }
                    }
                });
            }
        }, 0, 1000);
    }
}
