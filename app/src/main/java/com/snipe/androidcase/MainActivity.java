package com.snipe.androidcase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.snipe.androidcase.InterfaceStyle.TextViewActivity;
import com.snipe.androidcase.constants.ParamsConstant;
import com.snipe.androidcase.layout.FrameLayoutActivity;
import com.snipe.androidcase.layout.LinearLayoutActivity;
import com.snipe.androidcase.layout.RelativeLayoutActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"调用 onCreate");

    }

    /**
     * 点击事件
     * @Author created by snipe in 2022/2/24 22:14
     * @Param
     * @return
     */
    public void goFrameLayout(View view) {
        Log.d(TAG,"点击事件：touchMe");
        //显示跳转到 activity
        Intent intent = new Intent(this, FrameLayoutActivity.class);
        //传递参数,每个手机传递数据大小不同，不建议传递大数据
        intent.putExtra(ParamsConstant.intentData.getName(),"这是传递的值");
        startActivity(intent);

    }

    public void goLinearLayout(View view) {
        Intent intent = new Intent(this, LinearLayoutActivity.class);
        startActivity(intent);
    }

    public void goRelativeLayout(View view) {
        Intent intent = new Intent(this, RelativeLayoutActivity.class);
        startActivity(intent);
    }

    public void goTextView(View view) {
        Intent intent = new Intent(this, TextViewActivity.class);
        startActivity(intent);

    }
}