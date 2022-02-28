package com.snipe.androidcase.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.snipe.androidcase.MainActivity;
import com.snipe.androidcase.R;
/**
 * 相对布局
 * @Author created by snipe in 2022/2/28 21:27
 * @Param
 * @return
 */
public class RelativeLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
    }

    public void clickJump(View view) {
        //第一种：显示跳转
        Intent intent = new Intent(this, MainActivity.class);
        //第二种：隐式跳转 fixme-0：偶尔会出现 Could not execute method for android:onClick 异常，原因不详！
//        Intent intent = new Intent("com.snipe.androidcase.MainActivity");

        //第三种,携带参数，跳转拨号页面
//        Uri uri = Uri.parse("tel:10086");
//        Intent intent = new Intent(Intent.ACTION_DIAL, uri);

        //传递参数,每个手机传递数据大小不同，不建议传递大数据
        intent.putExtra("intentData","这是传递的值");
        startActivity(intent);

        //跳转后返回结果
        startActivityForResult(intent,123);
    }
}