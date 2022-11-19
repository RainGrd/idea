package com.bdqn.demo2.demo2;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 19:45:07
 * @description: 主方法
 * @version: 1.0
 * @param：
 */
public class UserTest {
    public static void main(String[] args) {
        User u1=new User("1",90);
        User u2=new User("2",25);
        User u3=new User("3",25);
        User u4=new User("4",88);
        HashSet<User> set = new HashSet<>();
        set.add(u1);
        set.add(u2);
        set.add(u3);
        set.add(u4);
        /*使用迭代器统计平均年龄*/
        Iterator<User> it = set.iterator();
        int  sum=0;
        while (it.hasNext()) {
            User u = it.next();
            System.out.println(u+" ");
            sum+=u.getAge();
        }
        int avg=sum/set.size();
        System.out.println("用户的平均年龄："+avg);
        System.out.println(u1.hashCode());
        System.out.println(u1.equals(u2));
    }
}
