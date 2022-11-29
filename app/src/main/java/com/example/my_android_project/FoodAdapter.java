package com.example.my_android_project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;


public class FoodAdapter extends ArrayAdapter<Food> {
    public FoodAdapter(Context context, ArrayList<Food> foodArrayList){
        super(context,R.layout.item_food,foodArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Food food = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_food,parent,false);
        }

        ImageView imageView = convertView.findViewById(R.id.image_view);
        TextView title = convertView.findViewById(R.id.title_textView);
        TextView detail = convertView.findViewById(R.id.detail_textView);
        TextView price = convertView.findViewById(R.id.textView_price);

        imageView.setImageResource(food.images);
        title.setText(food.name);
        detail.setText(food.information);
        price.setText(food.price);

        return convertView;


    }
}
