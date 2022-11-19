package com.bdqn.job.test1.work2;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/30 15:14:41
 * @description: 主方法
 * @version: 1.0
 * @param： 汽车类
 */
public class Car {
    /*汽车状态*/
    private Status status;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    /**
     *方法作用：获取汽车状态,初始化数据
     */
    public Car(Status status) {
        this.status = status;
    }
}
