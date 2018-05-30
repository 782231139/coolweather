package com.coolweather.android.zpc.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhu on 2018/5/29.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
