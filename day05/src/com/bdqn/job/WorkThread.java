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
public class WorkThread extends Thread{
    /**
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 18:58:34 2022/4/14
     * @param
     * @return
     * 方法描述：输出偶数
     **/
    @Override
    public void run() {

        for (int i=1; i<=100; i++) {
            if (i%2==0) {
                System.out.print(i+" ");
            }
            /*休眠*/
            try {
                this.sleep(15);
                this.join(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
            /*优先级*/
            this.yield();

        }
    }
}
