package com.bdqn.job.test2.work2;

import java.util.Objects;

/**
 * @author: duan.rong.gui
 * @date: 2022/4/1 14:50:04
 * @description: 主方法
 * @version: 1.0
 * @param：
 */
public class Student {
    private String name;
    private int age;

    public String getSid() {
        return sid;
    }

    private String sid;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name:'" + name + '\'' +
                ", age:" + age +
                ", sid:'" + sid + '\'' +
                '}';
    }
    /**
     *方法作用：初始化数据
     */
    public Student(String name, int age, String sid) {
        this.name = name;
        this.age = age;
        this.sid = sid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(sid, student.sid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sid);
    }
}
