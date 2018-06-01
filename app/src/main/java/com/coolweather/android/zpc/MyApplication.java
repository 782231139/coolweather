package com.coolweather.android.zpc;

import android.app.Application;
import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.guoxiaoxing.phoenix.core.listener.ImageLoader;
import com.guoxiaoxing.phoenix.picker.Phoenix;

import org.litepal.LitePal;

/**
 * Created by zhu on 2018/6/1.
 */

public class MyApplication extends Application {
    private static Context context;
    @Override
    public void onCreate() {
        context = getApplicationContext();
        LitePal.initialize(context);
        Phoenix.config()
                .imageLoader(new ImageLoader() {
                    @Override
                    public void loadImage(Context mContext, ImageView imageView
                            , String imagePath, int type) {
                        Glide.with(mContext)
                                .load(imagePath)
                                .into(imageView);
                    }
                });
    }
    public static Context getContext(){
        return context;
    }
}
