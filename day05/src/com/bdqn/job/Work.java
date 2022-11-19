package com.bdqn.job;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 * 创建两个线程,分别用于输出100以内的奇、偶数；
 *         然后用线程里面的方法去操作；
 *    常用的方法：start()、sleep()、stop()，run(),suspend()、resume()、yield()和wait()
 * setPriority()、setName()、getPriority()、getId()、getName()、getState()和isAlive()等
 */
public class Work {
    public static void main(String[] args) {
        /*创建两个线程*/
        WorkRun run = new WorkRun();
        WorkThread thread = new WorkThread();
        Thread t1 = new Thread(run,"奇数");
        /*启动线程*/
        System.out.print("1~100的奇数有：\n");
        t1.start();
        System.out.print("1~100的偶数有：\n");
        thread.start();
    }
}
