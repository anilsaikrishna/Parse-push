package com.example.anil1.sendfast.app;

/**
 * Created by anil on 11-04-2016.
 */

import android.app.Application;
import com.example.anil1.sendfast.helper.ParseUtils;

public class MyApplication extends Application {

    private static MyApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;

        // register with parse
        ParseUtils.registerParse(this);
    }


    public static synchronized MyApplication getInstance() {
        return mInstance;
    }
}