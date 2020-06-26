package com.pyyj.firstproject;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileOutputStream;

import androidx.appcompat.app.AppCompatActivity;

public class FourthActivity extends AppCompatActivity {

    Button save;
    EditText inputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        save = (Button) findViewById(R.id.save);
        inputText=(EditText)findViewById(R.id.inputText);


    }

    public void onClickSave(View v){
        switch (v.getId()){

            case R.id.save:

                Log.i("TAG", "save 진행");

                FileOutputStream fos = null;

                try{

                    fos = openFileOutput("memo.txt", Context.MODE_PRIVATE);
                    String out = inputText.getText().toString();
                    fos.write(out.getBytes());
                    Toast.makeText(FourthActivity.this, "save 완료", Toast.LENGTH_SHORT).show();

                }catch(Exception e){

                    e.printStackTrace();

                }finally{

                    try{ if(fos != null) fos.close(); }catch(Exception e){e.printStackTrace();}

                }

                break;



    }



}

    public void onClickH(View v){
        Intent b1 = new Intent(this, MainActivity.class);
        startActivity(b1);
        finish();
    }
}