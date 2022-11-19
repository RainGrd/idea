package com.bdqn.demo3.demo3;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 自定义异常类
 */
public class InsufficientFundsException extends Exception{
    private double amount;
    /**
     * @author 段荣贵
     * @description //TODO 肖萧奈何桥
     * @date 9:25:46 2022/4/8
     * @param amount 账户
     * 方法描述：初始化数据
     **/
    public InsufficientFundsException(double amount){
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
