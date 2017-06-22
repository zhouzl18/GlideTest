package com.feng.glidetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class MainActivity extends AppCompatActivity {

    private ImageView ivPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivPhoto = (ImageView) findViewById(R.id.imageView);
    }

    public void loadImage(View view){
        String url = "http://p1.pstatp.com/large/166200019850062839d3";
        String url1 = "http://pic.58pic.com/58pic/14/27/45/71r58PICmDM_1024.jpg";
        String url2 = "http://112.45.159.251:9001//resources/upload_Images/phone/51390754f90543eb985eadce9566cd73.jpg";
        Glide.with(this).load(url2).placeholder(R.drawable.loading_image).
                error(R.drawable.error_image).
                diskCacheStrategy(DiskCacheStrategy.ALL).into(ivPhoto);
    }
}
