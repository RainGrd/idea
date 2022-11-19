package com.job.test2.mployees;

import java.time.LocalDate;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/24 19:08:32
 * @description
 * 员工系统：创建抽象类父类员工类，创建子类工人类、销售员类、经理类继承员工类。
 * （1）员工类包含属性：姓名、薪水、雇用日期；包含抽象方法：输出基本信息（各属性的
 * 值）、涨工资（参数为工资增长百分比的分子）；包含普通方法：得到雇用日期的年份。
 * （2）工人类继承员工类。要有构造方法初始化继承的属性；要重写继承的抽象方法（备注：
 * 按照工资增长百分比涨工资，工资增长百分比需要通过参数传递，传递分子即可）。
 * （3）销售员类继承员工类。要有构造方法初始化继承的属性；包含自己的属性：业绩
 * （int,private）和其get()/set()方法；要重写继承的抽象方法。 涨工资的公式：工资×(1+(工资增
 * 长百分比的分子+业绩)÷100)。
 * （4）经理类继承员工类。要有构造方法初始化继承的属性；包含自己的属性：秘书名字
 * （private）和其get()/set()方法；要重写继承的抽象方法。涨工资的公式：工资×(1+(工资增长百
 * 分比的分子+工作年头的一半)÷100)。
 * （5）自定义包含main()方法的主类生成不同类的对象测试程序。
 */
public abstract class Employees {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 定义属性：姓名、薪水、雇用日期
     */
    private String name;
    private double salary;
    private String date;
    /**
     * 方法作用：输出基本信息（各属性的值）
     */
    abstract void showInfo();

    /**
     * 方法作用: 涨工资（参数为工资增长百分比的分子）
     */
    abstract double addAalary(double percentage);

    /**
     * 方法作用:得到雇用日期的年份
     */
    public int getYear() {
        //获取年份
        int year=Integer.parseInt(date.substring(0,4));
        /*获取当前日期*/
        LocalDate day = LocalDate.now();
        /*获取年份*/
        return (day.getYear()-year);
    }
    /**
     * 方法作用：初始化数据
     */
    public Employees(String name,double salary,String date) {
        this.name = name;
        this.salary = salary;
        this.date = date;
    }
}
