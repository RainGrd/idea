package com.bdqn.demo1;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class TestUser {
    public static void main(String[] args) throws ClassNotFoundException {
        User user = new User("王晓明");
        /*getClass()返回包含类表示所有的公共类和由此表示类的成员接口的对象类的数组*/
        Class c1=user.getClass();
        System.out.println(c1);
        /*.class语法*/
        Class c2=User.class;
        System.out.println(c2);
        /*Class.forName()方法*/
        Class c3 = Class.forName("com.bdqn.demo1.User");
        System.out.println(c3);
        /*每个类只有会一个Class对象，因此c1,c2,c3实际指向的是同一个对象*/
    }
}
