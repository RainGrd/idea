package com.bdqn.test4.demo3;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：使用lambda调用Runnable接口
 */
public class Test {
    public static void main(String[] args) {
        Runnable run = new Realize();
        /*启动线程*/
        new Thread(run).start();
        new Thread(run).start();
        new Thread(run).start();
        /*使用lambda简化Runnable接口*/
        run=()->{
            System.out.println("lambda run");
        };
        run.run();
    }
}
