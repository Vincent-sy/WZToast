package com.example.wenzhi.dialog;

import android.app.Application;


public class ToastApplication extends Application {

      @Override
    public void onCreate() {
        super.onCreate();
       // RxToast.setContext(this);
    }
}
