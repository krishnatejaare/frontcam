package com.example.krishnatejaare.frontcam;

/**
 * Created by Krishna Teja Are on 5/27/2017.
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

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