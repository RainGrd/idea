package com.job.demo1;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/22 16:01:22
 * @description 学生类
 * @param: 定义一个表示学生的类（Student）。Student类包括表示学生的学号、姓名、性别、年龄
 * 和3门课程成绩的信息数据及用来获得和设置学号、姓名、性别、年龄和3门课程成绩的方法。
 * 创建TestStudent类，在TestStudent类中生成5个学生对象，计算3门课程的平均成绩，以及某
 * 门课程的最高分和最低分
 */
public class Student {
    int stuNumber = 0;    //学号
    String stuName = "";  //姓名
    char sex;     //性别
    int age = 0;  //年龄
    //3门课程成绩
    double javaScore =0 ;
    double jsScore=0 ;
    double mysqlScore=0;
    //成绩数组
    double avg=0.0;
    double max=0;
    double min=0.0;
    //最高分
    public double max(double[] arr) {
        max = arr[0];
        for (int i=0; i<arr.length; i++) {
            if (arr[i] >max) {
                max = arr[i];
            }
        }
        return max;
    }
    //最低分
    public double min(double[] arr) {
        min = arr[0];
        for (int i=0; i<arr.length; i++) {
            if (arr[i] <min) {
                min = arr[i];
            }
        }
        return min;
    }
    //计算每个学生三门课程的平均值
    public double avg(double [] arr) {
        double sum=0;   //总和
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        avg=sum/arr.length;
        return avg;
    }
    //初始化数据
    public Student(int number, String name, char sex, int age,double java,double js,double mysql) {
        this.stuNumber = number;
        this.stuName = name;
        this.sex = sex;
        this.age = age;
        //添加三门成绩
        this.javaScore=java;
        this.jsScore=js;
        this.mysqlScore=mysql;
    }

}
