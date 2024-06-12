package com.arman.fragment271;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {


 TabLayout tabLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.tabLaout);






        FragmentManager fManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fManager.beginTransaction();
        fragmentTransaction.add(R.id.framLayout, new firstFragment());
        fragmentTransaction.commit();




        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                int tabPosition = tab.getPosition();


                if (tabPosition==0){

                    FragmentManager fManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fManager.beginTransaction();
                    fragmentTransaction.add(R.id.framLayout, new firstFragment());
                    fragmentTransaction.commit();

                } else if (tabPosition==1) {


                    FragmentManager fManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fManager.beginTransaction();
                    fragmentTransaction.add(R.id.framLayout, new SecondFragment());
                    fragmentTransaction.commit();

                }

            else if (tabPosition==2) {


                FragmentManager fManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fManager.beginTransaction();
                fragmentTransaction.add(R.id.framLayout, new ThirdFragment());
                fragmentTransaction.commit();

            }


            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

       /*==================================================
     button1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {


             FragmentManager fManager = getSupportFragmentManager();
             FragmentTransaction fragmentTransaction = fManager.beginTransaction();
             fragmentTransaction.add(R.id.framLayout, new firstFragment());
             fragmentTransaction.commit();

         }
     });

       */




    }
}