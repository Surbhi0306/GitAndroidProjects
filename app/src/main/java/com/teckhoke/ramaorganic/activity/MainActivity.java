package com.teckhoke.ramaorganic.activity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.smarteist.autoimageslider.SliderView;
import com.teckhoke.ramaorganic.model.SliderData;
import com.teckhoke.ramaorganic.R;
import com.teckhoke.ramaorganic.adapter.SliderAdapter;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        next=findViewById(R.id.btn_organic);
//        String image1=getResources().getDrawable(R.drawable.img1);
        String url1 = "https://www.geeksforgeeks.org/wp-content/uploads/gfg_200X200-1.png";
        String url2 = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.skh.com%2Fwp-content%2Fuploads%2F2020%2F01%2FiStock-1155240408-1-800x500.jpg&imgrefurl=https%3A%2F%2Fwww.skh.com%2Fthedish%2Ftypes-of-organic-food%2F&tbnid=kiQSdnj0F-TuQM&vet=12ahUKEwib1qe2gPjvAhXCBysKHV8YARoQMygEegUIARCKAQ..i&docid=2l28DCtGRmAKdM&w=800&h=500&q=organic%20images&ved=2ahUKEwib1qe2gPjvAhXCBysKHV8YARoQMygEegUIARCKAQ";
        String url3 = "https://bizzbucket.co/wp-content/uploads/2020/08/Life-in-The-Metro-Blog-Title-22.png";

        ArrayList<SliderData> sliderDataArrayList = new ArrayList<>();
        SliderView sliderView = findViewById(R.id.slider);
        sliderDataArrayList.add(new SliderData(url1));
        sliderDataArrayList.add(new SliderData(url2));
        sliderDataArrayList.add(new SliderData(url3));

        SliderAdapter adapter = new SliderAdapter(this, sliderDataArrayList);
        sliderView.setAutoCycleDirection(SliderView.LAYOUT_DIRECTION_LTR);
        sliderView.setSliderAdapter(adapter);
        sliderView.setScrollTimeInSec(3);
        sliderView.setAutoCycle(true);
        sliderView.startAutoCycle();

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });
    }
}
