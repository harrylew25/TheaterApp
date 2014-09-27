package com.ming.dayouxia.theaterapp;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;


public class TheaterHomeListActivity extends FragmentActivity {

    private TheaterHomeListFragment mListFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theater_home);
        setUpFragment();

    }

    private void setUpFragment(){
        FragmentManager fm = getSupportFragmentManager();
        mListFragment = (TheaterHomeListFragment) fm.findFragmentById(R.id.container);
        if(mListFragment == null){
            mListFragment = TheaterHomeListFragment.newInstance();
            fm.beginTransaction()
                    .replace(R.id.container, mListFragment)
                    .commit();
        }
    }
}