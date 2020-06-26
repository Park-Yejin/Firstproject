package com.pyyj.firstproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class FifthActivity extends AppCompatActivity {

    int i = 0;
    ImageView imageView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        Button b2 = (Button) findViewById(R.id.b3);
        imageView = (ImageView) findViewById(R.id.imageView);


        b2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                i=1-i;

                if(i==0){
                    imageView.setImageResource(R.drawable.note2);
                }
                else{
                    imageView.setImageResource(R.drawable.note3);
                }
            }
    });

    }

    public void onClickH(View v){
        Intent b1 = new Intent(this, MainActivity.class);
        startActivity(b1);
        finish();
    }
}