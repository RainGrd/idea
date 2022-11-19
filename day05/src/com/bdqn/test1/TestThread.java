package com.bdqn.test1;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class TestThread extends Thread{
    public TestThread(String url,String name){
        this.url = url;
        this.name = name;
    }
    /*文件名*/
    private String name;
    /*连接地址*/
    private String url;
    /**
     * @author 段荣贵
     * @description //TODO 肖萧奈何桥
     * @date 16:40:18 2022/4/9
     * @param 
     * @return 
     * 方法描述：重写run()方法
     **/
    @Override
    public void run() {
        new Download().downloads(url,name);
        System.out.println("下载了文件名"+name);
    }

    public static void main(String[] args) {
        /*创建线程类的对象*/
        TestThread t1 = new TestThread("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg.jj20.com%2Fup%2Fallimg%2Ftp01%2F1ZZQ214233446-0-lp.jpg&refer=http%3A%2F%2Fimg.jj20.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1652087712&t=6d6b0a328a3c5d3a246ac5bb6897f117","1.png");
        TestThread t2 = new TestThread("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Ffile02.16sucai.com%2Fd%2Ffile%2F2014%2F0814%2F17c8e8c3c106b879aa9f4e9189601c3b.jpg&refer=http%3A%2F%2Ffile02.16sucai.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1652087712&t=207d725d79f20f90c0d22fa7f99361e3","2.png");
        TestThread t3 = new TestThread("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg.jj20.com%2Fup%2Fallimg%2Ftp05%2F191002161310N50-0-lp.jpg&refer=http%3A%2F%2Fimg.jj20.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1652087712&t=c909633caba9a87fec9b507084d6d01f","3.png");
        /*启动线程*/
        t1.start();
        t2.start();
        t3.start();
    }
}
