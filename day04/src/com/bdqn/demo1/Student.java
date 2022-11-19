package com.bdqn.demo1;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class Student {
    /*定义属性*/
    private int id;
    private String name;
    private int age;
    private int sex;
    /**
     * @author 段荣贵
     * @description //TODO
     * @date 19:42:20 2022/4/7
     * @param id,name,age,sex 学号,姓名,年龄,性别
     * @return
     * 方法描述：
     **/
    public Student(int id, String name, int age, int sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
    /**
     * @author 段荣贵
     * @description //TODO 肖萧奈何桥
     * @date 19:43:46 2022/4/7
     * @param 
     * @return 
     * 方法描述：重写toString方法
     **/
    @Override
    public String toString() {
        return "Student{" +
                "学号=" + id +
                ", 姓名='" + name + '\'' +
                ", 年龄=" + age +
                ", 性别=" + sex +
                '}';
    }
}
