package com.shenyy.javabasicexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {
    private Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.println(Log.INFO,"Button Click","btn_1 is clicked!");
                showToast(btn1,"Button1 is clicked!");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.println(Log.INFO,"Button Click","btn_2 is clicked!");
            }
        });
    }

    public void showToast(View view){
        Toast.makeText(this,"Button is clicked",Toast.LENGTH_SHORT).show();
    }

    public void showToast(View view,String str){
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
    }
}