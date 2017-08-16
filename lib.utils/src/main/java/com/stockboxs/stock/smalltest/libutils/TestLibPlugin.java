package com.stockboxs.stock.smalltest.libutils;

import android.util.Log;

/**
 * Created by WeaponZhi on 2017/8/16.
 */

public class TestLibPlugin {
    public String getLibMethod() {
        Log.e("Lib", "lib is loaded");
        return "application is open";
    }
}
