package com.coolweather.android.zpc;

import android.app.Activity;
import android.os.Bundle;

public class LogoSplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MainActivity.launch(this);
        finish();
    }

}
