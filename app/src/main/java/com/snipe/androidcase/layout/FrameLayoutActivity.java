package com.snipe.androidcase.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.snipe.androidcase.R;
import com.snipe.androidcase.constants.ParamsConstant;

/**
 * @Author created by snipe in 2022/2/24 21:44
 * @Param
 * @return
 */
public class FrameLayoutActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "FrameLayoutActivity";
    private EditText etContent;
    private static final String msg = "set by Listener";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);

        Log.d(TAG, "调用 onCreate");
        //取值
        String data = getIntent().getStringExtra(ParamsConstant.intentData.getName());
        Log.d(TAG, data);
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();


        //STEP.click.1.2
        View btnGetContent = this.findViewById(R.id.btnGetContent);

        //STEP.click.2.2
        Button btnClick = this.findViewById(R.id.btnClick);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b = (Button) view;
                if (msg.equals(b.getText().toString())) {
                    btnClick.setText("修改按钮名称");
                } else {
                    btnClick.setText(msg);
                }
            }
        });

        //STEP.text.1.2 对 EditText 的输入监听
        etContent = this.findViewById(R.id.etContent);
        etContent.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Log.d(TAG, "变更前：" + charSequence);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Log.d(TAG, "变更时" + charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {
                Log.d(TAG, "变更后");
            }
        });
        //STEP.click.3.2 设置监听
        btnGetContent.setOnClickListener(this);
    }

    //点击事件
    @Override
    public void onClick(View view) {
        //STEP.click.3.3，上一步设置了才会生效
        if (view.getId() == R.id.btnGetContent) {
            String cont = "获取内容：" + etContent.getText().toString();
            Log.d(TAG, "获取内容：" + cont);
            Toast.makeText(this, cont, Toast.LENGTH_SHORT).show();
        }
    }
}