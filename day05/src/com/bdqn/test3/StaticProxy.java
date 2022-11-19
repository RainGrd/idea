package com.bdqn.test3;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class StaticProxy {
    public static void main(String[] args) {
        /*创建Runnable接口*/
        /*new you 对象*/
        Wedding wedding = new Wedding(new You());
        wedding.happyMarry();
        /*启动线程*/
        new Thread( ()-> System.out.println("我爱你！") ).start();
        new Wedding(new You()).happyMarry();
    }
}
