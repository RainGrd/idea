package com.job.test2.mployees;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/25 10:14:51
 * @description 销售员类
 * 员工系统：创建抽象类父类员工类，创建子类工人类、销售员类、经理类继承员工类。
 * （1）员工类包含属性：姓名、薪水、雇用日期；包含抽象方法：输出基本信息（各属性的值）、涨工资（参数为工资增长百分比的分子）；
 * 包含普通方法：得到雇用日期的年份。
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
public class Sales extends Employees{
    public int getResults() {
        return results;
    }

    public void setResults(int results) {
        this.results = results;
    }

    /*业绩*/
    private int results;
    /*工资百分比*/
    private double percentage;
    /**
     * 方法作用：初始化数据
     *
     * @param name
     * @param salary
     */
    public Sales(String name, double salary,String date,int results,double percentage) {
        super(name, salary,date);
        this.results = results;
        this.percentage = (percentage/100);
    }

    @Override
    void showInfo() {
        System.out.println("销售人员"+getName()+"的基本信息为：");
        System.out.println("每月薪水:"+getSalary()+"\n雇用日期："+getDate());
        System.out.println("工资增长比:"+((Math.round(percentage*100))+"%")+"\n涨幅后的工资"+addAalary(percentage));
    }

    /**
     * 方法作用:计算工资
     * 涨工资的公式：工资×(1+(工资增长百分比的分子+业绩)÷100)
     */
    @Override
    double addAalary(double percentage) {
        return Math.round(getSalary()*(1+(percentage+results)/100));
    }

}
