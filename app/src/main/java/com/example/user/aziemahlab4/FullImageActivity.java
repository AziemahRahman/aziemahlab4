package com.example.user.aziemahlab4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by user on 3/10/2017.
 */

public class FullImageActivity extends Activity {
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.full_image);

        Intent i=getIntent();

        int position=i.getExtras().getInt("id");
        imageAdapter imageAdapter =new imageAdapter(this);

        ImageView imageView=(ImageView) findViewById(R.id.full_image_view);
        imageView.setImageResource(imageAdapter.mThumbsId[position]);


    }
}
