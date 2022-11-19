package com.job.test2.mployees;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/25 14:12:11
 * @description 经理类
 */
public class Manager extends Employees{
    public String getClerkName() {
        return clerkName;
    }

    public void setClerkName(String clerkName) {
        this.clerkName = clerkName;
    }

    /*秘书名字*/
    private String clerkName;
    double percentage;
    /**
     * 方法作用：初始化数据
     *
     * @param name
     * @param salary
     * @param date
     */
    public Manager(String name, double salary, String date,double percentage,String clerkName) {
        super(name, salary, date);
        this.percentage = (percentage/100);
        this.clerkName=clerkName;
    }

    @Override
    void showInfo() {
        System.out.println("经理："+getName()+"的基本信息为：");
        System.out.println("每月薪水:"+getSalary()+"\n雇用日期："+getDate());
        System.out.println("工资增长比:"+((Math.round(percentage*100))+"%")+"\n涨幅后的工资"+addAalary(percentage));
        System.out.println("经理的秘书："+clerkName);
    }

    /**
     * 方法作用：涨工资的公式：工资×(1+(工资增长百
     * 分比的分子+工作年头的一半)÷100)
     */
    @Override
    double addAalary(double percentage) {
        return Math.round(getSalary()*(1+(percentage+(getYear()/2))/100));
    }
}
