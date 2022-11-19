package com.job.demo2;

/**
 * The type Home.
 *
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022 /3/24 7:31:17
 * @description 家庭类
 */
public class Home extends BaseLoan {

    public Home(double money, int year) {
        super(money, year);
    }

    /**
     *
     *方法作用：显示数据
     */
    @Override
    public void showInfo(){
        System.out.println("你为你的家庭贷款了"+this.getMoney()+"钱，贷款了"+this.year+"年," +
                "你在"+this.year+"年后可以获得利息"+this.calRete()+"元");
    }
}
