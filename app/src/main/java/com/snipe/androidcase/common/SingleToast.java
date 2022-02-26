package com.snipe.androidcase.common;

import android.content.Context;
import android.widget.Toast;

/**
 * fixme-test 实现消息快速覆盖，待测试
 * @Author created by snipe in 2022/2/26 21:48
 * @Param
 * @return
 */
public class SingleToast {
    private static Toast mToast;

    /**
     * 双重锁定，使用同一个Toast实例
     */
    public static Toast getInstance(Context context) {
        if (mToast == null) {
            synchronized (SingleToast.class) {
                if (mToast == null) {
                    mToast = new Toast(context);
                }
            }
        }
        return mToast;
    }
}