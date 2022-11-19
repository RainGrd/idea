package com.bdqn.demo4;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class DataStack {
    private int index=0;
    private char data[] =new char[10];
    public synchronized void push(char c){
        while (index==data.length){
            try {
                /*进入就绪状态*/
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        /*唤醒线程，进入就绪状态*/
        this.notify();
        data[index]=c;
        index++;
        System.out.println("input data:"+c);
    }
    public synchronized char pop(){
        while (index == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();
        index--;
        System.out.println("Output data:"+data[index]);
        return data[index];
    }
}
