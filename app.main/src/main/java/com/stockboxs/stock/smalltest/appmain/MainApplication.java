package com.stockboxs.stock.smalltest.appmain;

import android.app.Application;
import android.widget.Toast;

import com.stockboxs.stock.smalltest.libutils.TestLibPlugin;

/**
 * Created by WeaponZhi on 2017/8/16.
 */

public class MainApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        TestLibPlugin libPlugin = new TestLibPlugin();
        Toast.makeText(this,libPlugin.getLibMethod(),Toast.LENGTH_LONG).show();
    }
}
