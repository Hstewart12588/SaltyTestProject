package edu.tacoma.uw.css.hms88.saltytestproject;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import android.view.Menu;


public class MainActivity extends AppCompatActivity {
    private static final String STEPH_TAG = "STEPHANIE: ";

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {

        super.onStart();
        Log.e(TAG, "onStart: onStart");

        Log.d(STEPH_TAG, "Beep Boop I changed the code.");
    }



}
