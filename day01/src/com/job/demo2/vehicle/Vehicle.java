package com.job.demo2.vehicle;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/24 18:52:14
 * @description
 * 定义一个名称为Vehicle的接口，在接口中添加两个带有一个参数的方法start()和stop()。
 * 在两个名称分别为Bike和Bus的类中实现Vehicle接口。定义一个名称为interfaceDemo的类，
 * 在interfaceDemo类的main()方法中创建Bike和Bus对象，并访问start()和stop()方法。
 */
public interface Vehicle {
    /**
     *
     */
    void start(String name);
    void stop(String name);
}
