package com.bdqn.demo3;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class JoinThread implements Runnable {
    @Override
    public void run() {
        for(int i=0; i<6; i++){
            try {
                Thread.sleep(100);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        /*实例化对象*/
        JoinThread join = new JoinThread();
        /*启动线程*/
        Thread thread= new Thread(join);
        thread.start();
        for (int i = 1; i < 6; i++) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("正常情况下：" + i + "号车出发");
            try {
                thread.join(10000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
