package com.job.demo2;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/24 7:31:26
 * @description 汽车类
 */
public class Car extends BaseLoan {

    public Car(double money, int year) {
        super(money, year);
    }
    @Override
    public void showInfo(){
        System.out.println("你为你的汽车贷款了"+this.getMoney()+"钱，贷款了"+this.year+"年," +
                "你在"+this.year+"年后可以获得利息"+this.calRete()+"元");
    }
}
