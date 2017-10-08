package com.example.sumitroy.uicheck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ScreenThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_three);

        Thread thread=new Thread()
        {
            @Override
            public void run() {
                try {
                    sleep(8000);

                    Intent intent=new Intent(getApplicationContext(),ScreenFour.class);
                    startActivity(intent);
                    finish();



                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }
}
