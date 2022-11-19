package com.bdqn.test1;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class Test implements Runnable{
    private int x=0;
    private int y=0;
    boolean flag=true;
    public static void main(String[] args){
        Test r=new Test();
        Thread tl=new Thread(r);
        Thread t2=new Thread(r);
        tl.start();
        t2.start();
    }
    @Override
    public void run(){
        while(flag) {
            x++;
            y++;
            System.out.println("(" + x + "，" + y + ")");
            if (x >= 10) {
                flag = false;
            }
        }

    }
}
