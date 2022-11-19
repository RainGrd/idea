package com.job.demo2;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/24 7:26:48
 * @description 实现TheLoan类
 */
public abstract class BaseLoan implements ITheLoan {

    /*定义变量：月利率、贷款金额、贷款年限*/
    double rate;

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    private double money;
    int year;
    /**
     * 方法作用：计算贷款
     * 1.获取year
     * @return rate
     */
    @Override
    public double calRete() {
        switch (year) {
            case 1:
                rate=(money+money*0.0600)/12;
                break;
            case 2:
                rate = (money + money*0.0603)/36;
                break;
            case 3:
                rate = (money + money*0.0612)/60;
                break;
            case 4:
                rate = (money + money*0.039)/240;
                break;
            default:
                break;
        }
        return Math.round(rate);
    }
    public BaseLoan(double money,int year){
        this.money = money;
        this.year = year;
    }
}
