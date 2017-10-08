package com.example.sumitroy.uicheck;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class ScreenFive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_five);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar appbar = getSupportActionBar();
        appbar.setDisplayHomeAsUpEnabled(true);
        appbar.setDisplayShowHomeEnabled(true);

        Thread thread=new Thread()
        {
            @Override
            public void run() {
                try {
                    sleep(8000);

                    Intent intent=new Intent(getApplicationContext(),ScreenSix.class);
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
