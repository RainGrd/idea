package com.bdqn.demo2.demo2;

import java.util.Objects;

/*
 * @author: duan.rong.gui
 * @date: 2022/3/31 19:33:16
 * @description: 主方法
 * @version: 1.0
 * @param：
 */
public class User {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
//        如果年里不同，则返回false
        if(age!=user.age)return false;
        return name!=null?name.equals(user.name):user.name==null;
    }

    @Override
    public int hashCode() {
        /**/
        int result=name!=null?name.hashCode():0;
        result=31*result+age;
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", age=" + age;
    }
    //计算两个星期的日期
}
