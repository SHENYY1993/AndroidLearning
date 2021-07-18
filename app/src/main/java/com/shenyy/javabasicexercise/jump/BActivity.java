package com.shenyy.javabasicexercise.jump;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.shenyy.javabasicexercise.R;

public class BActivity extends AppCompatActivity {
    private Button mBtnJumpToA;
    private TextView mTvtitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bactivity);

        mTvtitle = findViewById(R.id.tv_title);
        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        int id = bundle.getInt("ID");

        mTvtitle.setText(name + ", " + id);

        mBtnJumpToA = findViewById(R.id.btn_jump);
        mBtnJumpToA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BActivity.this,AActivity.class);
                Bundle bundle1= new Bundle();
                bundle1.putString("title","Back from B");
                intent.putExtras(bundle1);
                setResult(Activity.RESULT_OK,intent);
                finish();
            }
        });
    }
}