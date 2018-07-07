#Android各种吐司设计

这里給大家介绍一下，几种简单的吐司的设计，虽然设计不难，但是有某些app界面显示比较好看。

效果：

![1](https://i.imgur.com/7hg7ybI.gif)

###这里设计了五种不同时刻需要的吐司，分别是

```
1、普通吐司
2、信息提示吐司
3、成功提示吐司
4、警告提示吐司
5、成功提示吐司
```


还有一些其他功能的吐司，比如有些页面需要三秒内两次后退为退出页面等等的提示。



这里把几个吐司的的使用封装在一个工具类中，需要的可以拿来使用就可以了。


###这个封装的吐司类，有几个优点：

```
1、吐司的样式好看
2、调用方便
3、吐司的时间可控，并且下一个吐司会直接覆盖上一个吐司,
系统的吐司是等上一个吐司完成后在显示下一个吐司，这样如果多次点击吐司会弹很久的吐司
4、退出程序吐司会关闭
```

##一.这里給大家看看上面显示页面调用的代码：

```
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



```


##二.吐司工具类的代码：
自己看下目录里面的代码



上面工具类的代码理解也是不难的，想用可以直接copy过去，但是这里是有几个小图标和一个背景图片的！

对于吐司工具列，不满意的可以进行适当修改，符合自己的使用习惯就好。



#共勉：不要把太多的时间留给迷茫。








