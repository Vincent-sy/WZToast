package com.example.wenzhi.dialog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //init Toast  ,最好是在Application中初始化，在所有Activity中都可以用！
        //后面修改了一下，使用Activity对象获取了Application的上下文，所以任何一个页面注册，其他页面都是可以使用
        RxToast.setContext(this);

    }

    //普通吐司
    public void commonToast(View view) {
        RxToast.normal("普通吐司");
        //等同
        //  RxToast.normal("普通吐司", Toast.LENGTH_SHORT);
        //默认是没有图标的，如果想加图标也可以
        //RxToast.normal("普通吐司", Toast.LENGTH_SHORT,getDrawable( R.mipmap.ic_launcher));
    }


    //信息提示吐司
    public void infoToast(View view) {
        RxToast.info("信息提示吐司");
        //等同
         //  RxToast.info("信息提示吐司", Toast.LENGTH_SHORT);
          // RxToast.info("信息提示吐司",Toast.LENGTH_SHORT,true).show();
    }


    //成功提示吐司
    public void successToast(View view) {
        RxToast.success("成功提示吐司");
        //等同
        //  RxToast.successToast("成功提示吐司",Toast.LENGTH_SHORT);
        //  RxToast.successToast("成功提示吐司",Toast.LENGTH_SHORT,true).show();
    }

    //警告提示吐司
    public void warnToast(View view) {
        RxToast.warning("警告提示吐司");
        //等同
        //  RxToast.warnToast("警告提示吐司",Toast.LENGTH_SHORT);
        //  RxToast.warnToast("警告提示吐司",Toast.LENGTH_SHORT,true).show();
    }

    //错误提示吐司
    public void errorToast(View view) {
        RxToast.error("错误提示吐司");
        //等同
        //  RxToast.errorToast("错误提示吐司",Toast.LENGTH_SHORT);
        //  RxToast.errorToast("错误提示吐司",Toast.LENGTH_SHORT,true).show();
    }

    //跳转到另一个页面
    public void jumpActivity(View view) {
        startActivity(new Intent(this, SecondActivity.class));
    }

    //提示两次返回退出程序
    public void doubleClickToast(View view) {
        boolean d = RxToast.doubleClickExit();
        if (d) {
            finish();
        }
    }


}
