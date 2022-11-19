package com.bdqn.demo1.demo6;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/29 20:26:00
 * @description: 主方法
 * @version: 1.0
 * @param：
 */
public class GenericMethod {
    public <T> void genericDisplay(T element){
        System.out.println(element.getClass().getName()+"="+element);
    }
    public static <T> T fun(T t){
        return t;
    }
}
