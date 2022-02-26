package com.snipe.androidcase.common;

public class StringUtils {

    public static boolean isEmpty(String str) {
        return !(isNotEmpty(str));
    }
    public static boolean isNotEmpty(String str) {
        return str != null && !"".equals(str) && str.length() > 0;
    }
}
