package com.bdqn.demo4;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class WriterPerson implements Runnable{
    DataStack stack;

    public WriterPerson(DataStack stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        char c;
        for (int i=0; i<5; i++){
            c=(char)(Math.random()*26+'a');
            /*往栈写入数据*/
            stack.push(c);
            try {
                Thread.sleep((int) (Math.random()*500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
