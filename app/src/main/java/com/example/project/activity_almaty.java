package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class activity_almaty extends AppCompatActivity implements View.OnClickListener{

public ImageView almaty;
public RelativeLayout grresto , grcenter , grhistpl , grplace;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almaty);

        almaty = (ImageView) findViewById(R.id.almaty);
        grresto = (RelativeLayout) findViewById(R.id.grresto);
        grcenter = (RelativeLayout) findViewById(R.id.grcenter);
        grhistpl = (RelativeLayout) findViewById(R.id.grhistpl);
        grplace = (RelativeLayout) findViewById(R.id.grplace);

        almaty.setOnClickListener(this);
        grresto.setOnClickListener(this);
        grcenter.setOnClickListener(this);
        grhistpl.setOnClickListener(this);
        grplace.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.almaty:
                i = new Intent(this,activity_aboutalmaty.class);
                startActivity(i);
                break;

            case R.id.grresto:
                i = new Intent(this,almaty_restaurants.class);
                startActivity(i);
                break;

            case R.id.grcenter:
                i = new Intent(this,almaty_razvlekat.class);
                startActivity(i);
                break;
            case R.id.grhistpl:
                i = new Intent(this,almaty_historicalpl.class);
                startActivity(i);
                break;
            case R.id.grplace:
                i = new Intent(this,almaty_mestoprojivanie.class);
                startActivity(i);
                break;

}}}