package com.example.schedules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton addBtn;
    ImageButton addBtn1;
    ImageButton addBtn2;
    ImageButton addBtn3;
    ImageButton addBtn4;
    ImageButton addBtn5;
    ImageButton addBtn6;
    ImageButton addBtn7;
    ImageButton addBtn8;
    ImageButton addBtn9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addBtn = (ImageButton) findViewById(R.id.imageButton6);
        addBtn1 = (ImageButton) findViewById(R.id.imageButton6_1);
        addBtn2 = (ImageButton) findViewById(R.id.imageButton6_2);
        addBtn3 = (ImageButton) findViewById(R.id.imageButton6_3);
        addBtn4 = (ImageButton) findViewById(R.id.imageButton6_4);
        addBtn5 = (ImageButton) findViewById(R.id.imageButton6_5);
        addBtn6 = (ImageButton) findViewById(R.id.imageButton6_6);
        addBtn7 = (ImageButton) findViewById(R.id.imageButton6_7);
        addBtn8 = (ImageButton) findViewById(R.id.imageButton6_8);
        addBtn9 = (ImageButton) findViewById(R.id.imageButton6_9);
        addBtn.setOnClickListener(this);
        addBtn1.setOnClickListener(this);
        addBtn2.setOnClickListener(this);
        addBtn3.setOnClickListener(this);
        addBtn4.setOnClickListener(this);
        addBtn5.setOnClickListener(this);
        addBtn6.setOnClickListener(this);
        addBtn7.setOnClickListener(this);
        addBtn8.setOnClickListener(this);
        addBtn9.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageButton6:
            case R.id.imageButton6_1:
            case R.id.imageButton6_9:
            case R.id.imageButton6_2:
            case R.id.imageButton6_4:
            case R.id.imageButton6_3:
            case R.id.imageButton6_5:
            case R.id.imageButton6_6:
            case R.id.imageButton6_7:
            case R.id.imageButton6_8:
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//                Log.d("red", "The button was clicked!");
                startActivity(intent);
                break;
        }
    }
}