package com.snipe.androidcase.constants;
/**
 * 传递值的常量值
 * @Author created by snipe in 2022/2/24 22:39
 * @Param
 * @return
 */
public enum ParamsConstant {


    intentData("intentData","");


    ParamsConstant(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    String name;
    String desc;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
