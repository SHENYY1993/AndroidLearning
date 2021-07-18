package com.shenyy.javabasicexercise;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TestActivity extends AppCompatActivity {
//    @Override
//    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
//        super.onCreate(savedInstanceState, persistentState);
//        setContentView(R.layout.activity_button);
//    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
    }

    public void showToast(View view){
        Toast.makeText(this,"Button is clicked",Toast.LENGTH_SHORT).show();
    }

    public void showToast(View view,String str){
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
    }
}
