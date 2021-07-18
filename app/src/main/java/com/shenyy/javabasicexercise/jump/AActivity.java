package com.shenyy.javabasicexercise.jump;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.shenyy.javabasicexercise.R;

public class AActivity extends AppCompatActivity {
    private Button mBtnJumpToB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aactivity);

        mBtnJumpToB = findViewById(R.id.btn_jump);
        mBtnJumpToB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //显示1
                Intent intent = new Intent(AActivity.this,BActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("name","Test Data");
                bundle.putInt("ID",10003);
                intent.putExtras(bundle);
//                startActivity(intent);
                startActivityForResult(intent,0);
                showToast(mBtnJumpToB,"显式1");

//                //显式2
//                Intent intent2 = new Intent();
//                intent2.setClassName(AActivity.this,"com.shenyy.javabasicexercise.jump.BActivity");
//                startActivity(intent2);
//                showToast(mBtnJumpToB,"显式2");
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Toast.makeText(AActivity.this,data.getExtras().getString("title"), Toast.LENGTH_SHORT).show();
    }

    public void showToast(View view, String str){
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
    }
}