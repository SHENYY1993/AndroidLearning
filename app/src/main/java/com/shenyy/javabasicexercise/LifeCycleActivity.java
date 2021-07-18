package com.shenyy.javabasicexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.Toast;

public class LifeCycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("LifeCycle","----onCreate----");
        setContentView(R.layout.activity_life_cycle);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle","----onStart----");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle","----onResume----");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle","----onPause----");
        Toast.makeText(LifeCycleActivity.this,"LifeCycleActivity is stopping!",Toast.LENGTH_SHORT);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle","----onStop----");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle","----onRestart----");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle","----onDestroy----");
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(KeyEvent.KEYCODE_HOME == keyCode) {
            AlertDialog.Builder builder = new AlertDialog.Builder(LifeCycleActivity.this);

            builder.setTitle("Mission is executing!").setMessage("Are you sure to quit?").setPositiveButton("YES", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            }).setNegativeButton("NO", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            }).show();
        }

        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        AlertDialog.Builder builder = new AlertDialog.Builder(LifeCycleActivity.this);

        builder.setTitle("Mission is executing!").setMessage("Are you sure to quit?").setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        }).setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        }).show();
    }

}