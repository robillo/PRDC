package com.appbusters.robinkamboj.prdc;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.button:{
                Intent i = new Intent(this, MainActivity.class);
                startActivity(i);
            }
        }
    }
}
