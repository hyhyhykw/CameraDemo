package com.laiki.zanq.camerademo;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();
        CameraFragment fragment = new CameraFragment();
        fragmentTransaction.add(R.id.container, fragment);
        ForeignFragment fragment1 = new ForeignFragment();
        fragmentTransaction.add(R.id.container, fragment1);
        fragmentTransaction.show(fragment);
        fragmentTransaction.show(fragment1);
        fragmentTransaction.commit();
    }
}
