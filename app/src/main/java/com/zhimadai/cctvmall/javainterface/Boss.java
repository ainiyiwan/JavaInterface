package com.zhimadai.cctvmall.javainterface;

/**
 * Author ： zhangyang
 * Date   ： 2017/9/19
 * Email  :  18610942105@163.com
 * Description  :
 */

public class Boss {
    TextView textView = new TextView();

    public void doSomeThing() {
      textView.setOnClickListener(new onClickListener() {
          @Override
          public void onClick() {
              System.out.println("这是一个点击事件");
          }
      });
    }
}

