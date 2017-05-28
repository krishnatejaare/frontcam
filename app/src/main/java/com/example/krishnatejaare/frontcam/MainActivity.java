package com.example.krishnatejaare.frontcam;

/**
 * Created by Krishna Teja Are on 5/27/2017.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

private Button button;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        //imageView = (ImageView) findViewById(R.id.result);
        button.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button) {

            Intent i = new Intent(MainActivity.this, MakePhotoActivity.class);

            startActivity(i);
        }
    }
}