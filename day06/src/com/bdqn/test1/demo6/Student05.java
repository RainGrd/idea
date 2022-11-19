package com.bdqn.test1.demo6;

/**
 * @author wangheng
 * @version 1.0
 * @date 2022/4/11 14:34
 * @description 主方法
 */
public class Student05{

    private String name;

    public int age;

    
    public Student05(String name,int age){
        this.age=age;
        this.name=name;
    }

    public Student05(){}

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

    private void study(String name,int age){
        System.out.println(name+age+"岁除了喜欢吃，也爱学习！");
    }

    @Override
    public String toString() {
        return "Student05{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
