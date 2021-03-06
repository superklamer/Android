package com.superlamer.splitscreendemo;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode, Configuration newConfig) {
        super.onMultiWindowModeChanged(isInMultiWindowMode, newConfig);

        // multi winndow mode has changed
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (isInMultiWindowMode()) {
            // we're in multi window mode!
        }

        if (isInPictureInPictureMode()) {
            // we are in picture in picture mode
        }
    }
}
