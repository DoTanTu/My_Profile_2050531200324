package com.example.my_android_project;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.my_android_project.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

    ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = this.getIntent();

        if(intent != null){


            String title = intent.getStringExtra("name");
            String detail = intent.getStringExtra("detail");
            String price = intent.getStringExtra("price");
            int imageid = intent.getIntExtra("image",R.drawable.mon1);

            binding.nameProductTextView.setText(title);
            binding.detailProductTextView.setText(detail);
            binding.priceProductTextView.setText(price);
            binding.imageView.setImageResource(imageid);

        }
        else
            System.out.println("ket qua tra ve la:" + 0);

    }
}