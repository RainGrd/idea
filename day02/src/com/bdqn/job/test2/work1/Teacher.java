package com.bdqn.job.test2.work1;

import java.util.Objects;

/**
 * @author: duan.rong.gui
 * @date: 2022/4/1 9:44:36
 * @description: 主方法
 * @version: 1.0
 * @param：
 */
public class Teacher {
    /*定义教书姓名、年龄、薪水*/
    private String name;
    private int age;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 方法作用：初始化数据
     */
    public Teacher(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return age == teacher.age && Double.compare(teacher.salary, salary) == 0 && Objects.equals(name, teacher.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary);
    }
}
