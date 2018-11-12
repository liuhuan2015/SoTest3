package com.liuh.sousetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.liuh.sotest3.Hello;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

//    static {
//        System.loadLibrary("myjni");
//    }

    private TextView tvSoUse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSoUse = findViewById(R.id.tv_so_use);

        tvSoUse.setText("jni计算结果：" + new Hello().add(8, 34));

    }
}
