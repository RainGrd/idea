package com.bdqn.test2;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：模拟龟兔赛跑
 */
public class Race implements Runnable{
    /*胜利者*/
    private static  String winner;
    @Override
    public void run() {
        /*利用for循环打印当前线程的名字*/
        for(int i=0; i<=100; i++){
            /*模拟兔子休息*/
            if("兔子".equals(Thread.currentThread().getName()) && i%10==0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            /*判断比赛是否结束*/
            if (gameOver(i)){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"跑了"+i+"步");
        }
    }
    /*判断是否完成比赛*/
    public boolean gameOver(int stop) {
        /*判断是否有胜利者*/
        if (winner!=null) { //已经存在胜利者了
            /*停止循环*/
            return true;
        }{
            if(stop==100){
                /*获取胜利者的名称 */
                winner=Thread.currentThread().getName();
                System.out.println("winner is"+winner);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        /*定义赛道*/
        Race race = new Race();
        /*启动线程*/
        new Thread(race,"兔子").start();
        new Thread(race,"乌龟").start();
    }
}
