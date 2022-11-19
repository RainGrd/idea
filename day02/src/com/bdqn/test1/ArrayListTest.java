package com.bdqn.test1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * @param：
 */
public class ArrayListTest {
    public static void main(String[] args) {
        /*创建集合对象*/
        ArrayList<Student> list=new ArrayList<>();
        /*键盘录入学生对象所需要的数据*/
        /*Scanner sc=new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name=sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age=sc.nextLine();*/
        /*创建学生对象，并初始化数据*/
        /*Student s1 = new Student();
        s1.setName(name);
        s1.setAge(age);
        Student s1 = new Student();
        s1.setName(name);
        s1.setAge(age);
        Student s1 = new Student();
        s1.setName(name);
        s1.setAge(age);*/
        //*添加学生对象*//
        /*list.add(s1);*/
        /*为了提高代码的复用性*/
        addStudent(list);
        addStudent(list);
        addStudent(list);
        /*遍历集合，输出学生对象*/
        for (Student s:list){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
    /**
     * @author 段荣贵
     * @description //TODO
     * @date 7:27:46 2022/4/6
     * @return void
     *
     */
    /*添加学生对象*/
    public static void addStudent(ArrayList<Student> list){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name=sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age=sc.nextLine();
        Student s1 = new Student();
        s1.setName(name);
        s1.setAge(age);
        list.add(s1);
    }


}
