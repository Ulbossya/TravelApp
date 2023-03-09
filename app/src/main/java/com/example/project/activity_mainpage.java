package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;

public class activity_mainpage extends AppCompatActivity implements View.OnClickListener {
    public RelativeLayout relative1;
    public RelativeLayout relative2;
    public RelativeLayout relative3;
    public RelativeLayout relative4;
    public RelativeLayout relative5;
    public RelativeLayout relative6;
    public RelativeLayout relative7;
    public RelativeLayout relative8;
    public RelativeLayout relative9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);

        relative1 = (RelativeLayout) findViewById(R.id.relative1);
        relative2 = (RelativeLayout) findViewById(R.id.relative2);
        relative3 = (RelativeLayout) findViewById(R.id.relative3);
        relative4 = (RelativeLayout) findViewById(R.id.relative4);
        relative5 = (RelativeLayout) findViewById(R.id.relative5);
        relative6 = (RelativeLayout) findViewById(R.id.relative6);
        relative7 = (RelativeLayout) findViewById(R.id.relative7);
        relative8 = (RelativeLayout) findViewById(R.id.relative8);
        relative9 = (RelativeLayout) findViewById(R.id.relative9);



        relative1.setOnClickListener(this);
        relative2.setOnClickListener(this);
        relative3.setOnClickListener(this);
        relative4.setOnClickListener(this);
        relative5.setOnClickListener(this);
        relative6.setOnClickListener(this);
        relative7.setOnClickListener(this);
        relative8.setOnClickListener(this);
        relative9.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.relative1:
                i = new Intent(this,activity_almaty.class);
                startActivity(i);
                break;

            case R.id.relative2:
                i = new Intent(this,activity_shymkent.class);
                startActivity(i);
                break;

            case R.id.relative3:
                i = new Intent(this,activity_burabay.class);
                startActivity(i);
                break;
            case R.id.relative4:
                i = new Intent(this,activity_tashkent.class);
                startActivity(i);
                break;
            case R.id.relative5:
                i = new Intent(this,activity_aktau.class);
                startActivity(i);
                break;
            case R.id.relative6:
                i = new Intent(this,activity_turkistan.class);
                startActivity(i);
                break;
            case R.id.relative7:
                i = new Intent(this,activity_taraz.class);
                startActivity(i);
                break;
            case R.id.relative8:
                i = new Intent(this,activity_kapchagay.class);
                startActivity(i);
                break;
            case R.id.relative9:
                i = new Intent(this,activity_bishkek.class);
                startActivity(i);
                break;
        }
    }

}