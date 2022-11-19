package com.bdqn.demo4;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class ReaderPerson implements Runnable{
    DataStack stack;

    public ReaderPerson(DataStack stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        for(int i=0; i<5; i++){
            stack.pop();
            try {
                Thread.sleep((int)(Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
