package com.bdqn.demo2;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class ThreadOne extends Thread{
    private String name;    //继承类
    public ThreadOne(String name){
        this.name = name;
    }
    /**
     * @author 段荣贵
     * @description //TODO 肖萧奈何桥
     * @date 8:09:38 2022/4/9
     * @param 
     * @return 
     * 方法描述：重写run方法
     **/
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("My name:"+name);
            try {
                /*暂停线程五秒*/
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
