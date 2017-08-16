package com.stockboxs.stock.smalltest;

import android.app.Application;

import net.wequick.small.Small;

/**
 * Created by WeaponZhi on 2017/8/15.
 */

public class ImoocApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Small.preSetUp(this);
    }
}
