package com.bdqn.test1.demo1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static java.lang.Class.forName;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：利用反射创建对象
 *
 * */
public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Class对象
        Class<?> c = forName("com.bdqn.test1.demo1.Student");
        Constructor<?> cons = c.getConstructor(String.class,int.class,String.class);
        /*基本数据类型也可以通过.class得到对应的Class类型*/
        Object obj = cons.newInstance("林青霞", 30, "西安");
        System.out.println(obj);
    }
}
