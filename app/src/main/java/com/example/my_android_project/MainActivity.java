package com.example.my_android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView imgView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imgView = (ImageView) findViewById(R.id.id_comback_main);
        imgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageClick();
            }
        });
    }
    public void ImageClick(){
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);

    }
}