package com.wrap.test1;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/24 15:37:25
 * @description 银行账户
 * 编写一个类实现银行账户的概念，包含的属性有“帐号”、“密码”、“存款余额”、“利率”、“最小余额”，
 * 定义封装这些属性的方法。账号要自动生成。
 * 编写主类，使用银行账户类，输入、输出3个储户的上述信息。
 * 考虑:哪些属性可以设计成static属性。
 */
public class Acount {/*账号*/
    private  int id;
    /*密码*/
    private String password="000000";
    /*账户余额*/
    private double balance;
    /*利率:由于银行的利率的一般一致，所以都是共享的*/
    private static double interestRate=0.0600;
    /*存放的最低余额：*/
    private static double minMoney=1.0;
    /*账户自动生成id使用的*/
    private static int init = 1001;

    public int getId() {
        return id;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Acount.interestRate = interestRate;
    }

    public static double getMinMoney() {
        return minMoney;
    }

    public static void setMinMoney(double minMoney) {
        Acount.minMoney = minMoney;
    }
    /**
     *
     *方法作用:用于实现自动生成账户
     */
    public Acount(){
        id=init++;
    }
    /**
     *
     *方法作用：初始化数据
     */
    public Acount(String pwd,double balance){
        this();
        this.password=pwd;
        this.balance=balance;
    }

    /**
     * 方法作用：重写toString方法
     */
    @Override
    public String toString() {
        return "Acount{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}
