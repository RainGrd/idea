package com.job.demo2.vehicle;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/24 18:57:47
 * @description 主方法
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Bus bus = new Bus();
        bike.start("自行车");
        bus.start("公共汽车");
        bike.stop("自行车");
        bus.stop("公共汽车");
    }
}
