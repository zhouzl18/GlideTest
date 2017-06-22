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
        Glide.with(this).load(url).placeholder(R.mipmap.ic_launcher).diskCacheStrategy(DiskCacheStrategy.NONE).into(ivPhoto);
    }
}
