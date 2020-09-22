package com.starlabs.syllabusdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageClickListener;
import com.synnapps.carouselview.ImageListener;

public class swipeActivity extends AppCompatActivity {
    private int[] mImages = new int[]{
            R.drawable.img_1,R.drawable.img_2,R.drawable.img_3,R.drawable.img_4,R.drawable.img_5
    };

    private String[] mImagesTittle = new String[]{
            "slide 1","slide 2","slide 3","slide 4","slide 5"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe);
        setContentView(R.layout.activity_main);
        CarouselView carouselView = findViewById(R.id.slider);
        carouselView.setPageCount(mImages.length);
        carouselView.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(mImages[position]);
            }
        });
        carouselView.setImageClickListener(new ImageClickListener() {
            @Override
            public void onClick(int position) {
                Toast.makeText(swipeActivity.this, "position", Toast.LENGTH_SHORT).show();
            }
        });

    }
}