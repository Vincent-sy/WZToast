package com.example.wenzhi.dialog;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button button=new Button(this);
        button.setText("Toast");
        setContentView(button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TAG","onCreate");
                //信息吐司，长时间显示，没有图标
                RxToast.info("另一个页面的信息", Toast.LENGTH_LONG,false).show();
            }
        });

    }
}
