package com.snipe.androidcase.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.snipe.androidcase.R;
import com.snipe.androidcase.constants.ParamsConstant;

/**
 * 帧布局可以说是最简单的ViewGroup。
 * 当我们往里面添加控件的时候，会默认把控件放在左上角，如果放多个会有叠加效果，这种布局没有任何的定位方式。
 * 参考文档：https://developer.android.google.cn/reference/android/widget/FrameLayout?hl=ch
 * @Author created by snipe in 2022/2/24 21:44
 * @Param 
 * @return 
 */
public class FrameLayoutActivity extends AppCompatActivity {

    private static final String TAG = "FrameLayoutActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);

        Log.d(TAG,"调用 onCreate");
        //取值
        String data = getIntent().getStringExtra(ParamsConstant.intentData.getName());
        Log.d(TAG,data);
        Toast.makeText(this,data,Toast.LENGTH_SHORT).show();


    }
}