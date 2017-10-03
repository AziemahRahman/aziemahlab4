package com.example.user.aziemahlab4;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by user on 2/10/2017.
 */

public class imageAdapter extends BaseAdapter {

    private Context mContext;

    public Integer[] mThumbsId = {
            R.drawable.a1,
            R.drawable.a2,
            R.drawable.a3,
            R.drawable.b4,
            R.drawable.b5,
            R.drawable.b6,


    };

    public imageAdapter(Context c){
        mContext = c;
    };

    @Override
    public int getCount(){
        return mThumbsId.length;
    };

    @Override
    public Object getItem(int position){
        return mThumbsId[position];
    };

    @Override
    public long getItemId(int position){
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbsId[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(150,150));
        return imageView;
    };
}
