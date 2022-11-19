package com.bdqn.job.work;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class Student implements Father{
    /*定义属性*/
    private String name;
    private int age;
    private int result;

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

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    /**
     * @author 段荣贵
     * @description //TODO 肖萧奈何桥
     * @date 16:56:27 2022/4/11
     * @param 
     * @return 
     * 方法描述：有参构造
     **/
    public Student(String name, int age, int result) {
        this.name = name;
        this.age = age;
        this.result = result;
    }
    /**
     * @author 段荣贵
     * @description //TODO 肖萧奈何桥
     * @date 16:56:12 2022/4/11
     * @param 
     * @return 
     * 方法描述：无参构造
     **/
    public Student() {
    }

    @Override
    public String toString() {
        return "学生信息为：" +
                "姓名:" + name  +
                ",年龄:" + age +
                ",成绩:" + result;
    }
}
