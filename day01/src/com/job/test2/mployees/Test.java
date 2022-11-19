package com.job.test2.mployees;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/24 20:34:43
 * @description 主方法
 */
public class Test {
    public static void main(String[] args) {
        /*工人基本信息：姓名，每月工资，雇用日期和工资百分比*/
        Workers workers = new Workers("周珩", 3000.0,"2005-12-24",10);
        //显示工人的基本信息
        workers.showInfo();
        /*销售人员类*/
        Sales sales = new Sales("龙涛", 4000.0,"2021-3-5", 8,40);
        /*显示销售人员的基本信息*/
        sales.showInfo();
        Manager manager = new Manager("小明", 8000.0, "2008-8-1", 50, "小红");
        /*显示经理类的基本信息*/
        manager.showInfo();
    }
}
