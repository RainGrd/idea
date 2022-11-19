package com.bdqn.test1.demo4;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class ReflectTest01 {
    public static void main(String[] args) {
        /*创建集合*/
        ArrayList<Integer> arrayList=new ArrayList<>();
        /*添加数据*/
        arrayList.add(10);
        arrayList.add(20);
        /*获取Class对象*/
        Class<? extends ArrayList> aClass = arrayList.getClass();
        try {
            Method add = aClass.getMethod("add",Object.class);
            add.invoke(arrayList,"Hello");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(arrayList);
    }
}
