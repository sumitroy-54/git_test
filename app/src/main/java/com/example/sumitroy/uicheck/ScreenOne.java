package com.example.sumitroy.uicheck;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;

public class ScreenOne extends AppCompatActivity {

    BottomBar bottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_one);
        bottomBar=BottomBar.attach(this,savedInstanceState);
        bottomBar.noNavBarGoodness();
        bottomBar.noResizeGoodness();
        bottomBar.noTabletGoodness();

        bottomBar.setItemsFromMenu(R.menu.bannerbottombar, new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(@IdRes int menuItemId) {
                if(menuItemId==R.id.bottombaritem1)
                {
                    HomeFragment f1=new HomeFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame1,f1).commit();

                }

                else if(menuItemId==R.id.bottombaritem2)
                {
                    AppointmentFragment f2=new AppointmentFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame1,f2).commit();
                }

                else if(menuItemId==R.id.bottombaritem3)
                {
                    ReportFragment f3=new ReportFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame1,f3).commit();
                }
                else //(menuItemId==R.id.bottombaritem4)
                {
                    SettingsFragment f4=new SettingsFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame1,f4).commit();

                }
            }

            @Override
            public void onMenuTabReSelected(@IdRes int menuItemId) {

            }
        });
        bottomBar.mapColorForTab(0,"#EF5350");
        bottomBar.mapColorForTab(1,"#3F51B5");
        bottomBar.mapColorForTab(2,"#CDDC39");
        bottomBar.mapColorForTab(3,"#9C27B0");


        Thread thread=new Thread()
        {
            @Override
            public void run() {
                try {
                    sleep(8000);

                        Intent intent=new Intent(getApplicationContext(),ScreenTwo.class);
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
