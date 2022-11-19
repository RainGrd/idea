package com.job.test3.work1;

import java.time.LocalDate;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/27 8:34:07
 * @description 主方法
 */
public class Albb implements IAdvertising{
    String name;
    String slogan;
    /*时间类*/
    LocalDate date;
    /**
     * 方法作用:并包含公司名称、广告语、展示时间属性
     */
    @Override
    public void show() {
        System.out.println("公司名称:"+name+"\n广告语:"+slogan+"\n创建日期:"+date.now());
    }

    /**
     * 方法作用:初始化数据
     */
    public Albb(String name, String slogan, int year,int month,int day){
        this.name = name;
        this.slogan = slogan;
        this.date=LocalDate.of(year,month,day);
    }

}
