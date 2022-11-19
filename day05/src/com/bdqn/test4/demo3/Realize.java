package com.bdqn.test4.demo3;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class Realize implements Runnable {
    @Override
    public void run() {
        for (int i=0; i<50; i++){
            System.out.println("Realize"+i);
        }
    }
}
