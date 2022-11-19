package com.bdqn.demo2;

import com.bdqn.demo1.User;

import java.lang.reflect.Constructor;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class Test01 {
    public static void main(String[] args) {
        String path="com.bdqn.demo1.User";
        /*创建CLass对象*/
        try {
            Class<?> c = Class.forName(path);
            Constructor<?>[] cons = c.getConstructors();
            for (Constructor<?> con : cons) {
                /*指向对象都是User*/
                System.out.println(con);
            }
            System.out.println("********************");
            /*获取无参构造方法*/
            Constructor<?> c1 = c.getDeclaredConstructor(null);
            System.out.println(c1);
            /*获得带参构造方法*/
            Constructor<?> c2 = c.getDeclaredConstructor(int.class, String.class);
            System.out.println(c2);
            /*调用构造方法、构造对象*/
            User user1=(User) c.newInstance();
            User user2=(User) c1.newInstance(null);
            User user3= (User) c2.newInstance(21,"王晓明");
            user1.printName();
            user2.printName();
            user3.printName();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
