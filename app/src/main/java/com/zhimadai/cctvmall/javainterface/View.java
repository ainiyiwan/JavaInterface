package com.zhimadai.cctvmall.javainterface;

/**
 * Author ： zhangyang
 * Date   ： 2017/9/19
 * Email  :  18610942105@163.com
 * Description  :
 */

public class View {
    /*
     * 调用回调接口对象中的方法
     */
    public void setOnClickListener(onClickListener listener) {
        listener.onClick();
    }
}
