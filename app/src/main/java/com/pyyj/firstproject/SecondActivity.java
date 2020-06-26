package com.pyyj.firstproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);}


    public void onClickH(View v){
        Intent b1 = new Intent(this, MainActivity.class);
        startActivity(b1);
        finish();


        }
        public void onClicksub(View v) {
            Intent t2 = new Intent(this, SecondSubActivity.class);
            startActivity(t2);
        }






                    }




