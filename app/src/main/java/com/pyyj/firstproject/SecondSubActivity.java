package com.pyyj.firstproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondSubActivity extends SecondActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondsub);
    }



    public void onClickH(View v) {
        Intent b1 = new Intent(this, MainActivity.class);
        startActivity(b1);
        finish();

    }
    }



