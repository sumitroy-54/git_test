package com.example.sumitroy.uicheck;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class ScreenFour extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_four);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar appbar = getSupportActionBar();
        appbar.setDisplayHomeAsUpEnabled(true);
        appbar.setDisplayShowHomeEnabled(true);

        tabLayout=(TabLayout)findViewById(R.id.tablayout);
        viewPager=(ViewPager)findViewById(R.id.viewpager);
        viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragments(new MenFragment(),"MEN");
        viewPagerAdapter.addFragments(new WomenFragment(),"WOMEN");
        viewPagerAdapter.addFragments(new ChildFragment(),"KIDS");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        Thread thread=new Thread()
        {
            @Override
            public void run() {
                try {
                    sleep(8000);

                    Intent intent=new Intent(getApplicationContext(),ScreenFive.class);
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
