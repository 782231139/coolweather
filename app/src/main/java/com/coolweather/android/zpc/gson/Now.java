package com.coolweather.android.zpc.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhu on 2018/5/30.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;

    }
}
