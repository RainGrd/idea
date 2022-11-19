package com.bdqn.demo2;

import com.bdqn.demo1.User;

import java.lang.reflect.Method;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class Test00 {
    public static void main(String[] args) {
        /*创建包的路径*/
        String path="com.bdqn.demo1.User";
        try {
            Class<?> aClass = Class.forName(path);
            /*获取当前系统时间*/
            long reflectStart1 = System.currentTimeMillis();
            User user1=(User) aClass.newInstance();
            Method method1 = aClass.getDeclaredMethod("setUname",String.class);
            for(int i=0; i<1000000; i++){
                method1.invoke(user1,"王晓明");
            }
            /*执行结束时间*/
            long reflectEnd1=System.currentTimeMillis();
            long objectStart1=System.currentTimeMillis();
            User user2=new User();
            for(int i=0; i<1000000; i++){
                user2.setUname("王晓明");
            }
            long objectEnd1=System.currentTimeMillis();
            System.out.println("反射机制执行时间:"+(reflectEnd1-reflectStart1));
            System.out.println("普通方法执行时间:"+(objectEnd1-objectStart1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
