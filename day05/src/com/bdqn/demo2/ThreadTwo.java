package com.bdqn.demo2;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：使用Runnable接口创建多线程
 */
public class ThreadTwo implements Runnable {
    Thread thread;
    private String name;

    public ThreadTwo(String name) {
        this.name = name;
    }
    /**
     * @author 段荣贵
     * @description //TODO 肖萧奈何桥
     * @date 14:22:33 2022/4/9
     * @param 
     * @return 
     * 方法描述：重写run()方法
     **/
    @Override
    public void run(){
        /*遍历十次*/
        for(int i=0; i<10; i++){
            /*输出*/
            System.out.println("My name is"+name);
            /*暂停线程0.5秒，也就是0.5秒后遍历一次for循环*/
            try {
                thread.join(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
