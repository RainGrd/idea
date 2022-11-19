package com.bdqn.demo4;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class StackTest {
    public static void main(String[] args) {
        DataStack stack=new DataStack();
        WriterPerson writerPerson = new WriterPerson(stack);
        ReaderPerson readerPerson = new ReaderPerson(stack);
        /*启动线程*/
        Thread t1=new Thread(writerPerson,"写");
        Thread t2=new Thread(readerPerson,"读");
        t1.start();
        t2.start();
    }
}
