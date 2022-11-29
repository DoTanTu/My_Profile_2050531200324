package com.example.my_android_project;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.my_android_project.databinding.ActivityMainBinding;
import com.example.my_android_project.databinding.ActivityMainFoodBinding;

import java.util.ArrayList;

public class ListFoodActivity extends AppCompatActivity {
    private ActivityMainFoodBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainFoodBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int[] images = {R.drawable.mon1,R.drawable.mon2,R.drawable.upla,R.drawable.hampeger,R.drawable.banhmi,R.drawable.an_sang_tong_hop,R.drawable.banh_kep_thit,R.drawable.tom_tau_alaska};
        String[] title = {"Thịt kho tẩm bột","Bún đậu mắm tôm","Mỳ chiên trứng gà","Bánh mỳ kẹp","Bánh mỳ ăn nhẹ","Đồ ăn tổng hợp","Bánh mỳ kẹp thịt ","Tôm alaska kho tàu"};
        String[] detail ={"Hương vị truyền thống...","Đặc sắc hương vị...","Buổi sáng nhẹ nhàng...","Loại bột đặc biệt...","Hương thơm độc lạ...","Buổi sáng đầy đủ...","Dai dòn cực tuyệt...","Ngon , bổ, rẻ..."};
        String[] price = {"6$","2$","4$","3$","2$","9$","4$","6$"};
        
        ArrayList<Food> arrayList = new ArrayList<>();
        
        for(int i = 0; i < images.length;i++){
            Food food = new Food(images[i],title[i],detail[i],price[i]);
            arrayList.add(food);
        }

        FoodAdapter listAdapter = new FoodAdapter(ListFoodActivity.this,arrayList);
        
        binding.listViewFood.setAdapter(listAdapter);
        binding.listViewFood.setClickable(true);
        binding.listViewFood.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ListFoodActivity.this,DetailActivity.class);
                intent.putExtra("name", title[i]);
                intent.putExtra("detail", detail[i]);
                intent.putExtra("price", price[i]);
                intent.putExtra("image",images[i]);
                startActivity(intent);
            }
        });
    }
}