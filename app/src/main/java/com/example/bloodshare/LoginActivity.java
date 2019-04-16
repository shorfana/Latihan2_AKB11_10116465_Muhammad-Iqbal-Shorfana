package com.example.bloodshare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



    }

    public void onClick(View v){
        Intent intent = null;
        switch(v.getId()){
            case R.id.btn_Register:
                intent = new Intent(this,RegisterActivity.class);
                break;
        }
        if (null!=intent) startActivity(intent);
    }
}
