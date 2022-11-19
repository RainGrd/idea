package com.job.demo1;

import java.util.Scanner;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/22 16:19:32
 * @description 学生测试类
 */
public class StudentTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        /*需求：生成5个学生对象，计算3门课程的平均成绩，以及某门课程的最高分和最低分。*/
        Student stu1 = new Student(1224,"段荣贵",'男',16,80.0,80.0,90.0);
        Student stu2 = new Student(1224,"周珩",'男',17,90.0,75.0,90.0);
        Student stu3 = new Student(1224,"谭志扬",'男',17,80.0,80.0,80.0);
        Student stu4 = new Student(1224,"杨鑫",'男',17,90.0,70.0,90.0);
        Student stu5 = new Student(1224,"江轩",'男',17,70.0,80.0,90.0);
        /*计算3门课程的最高分、最低分、平均分*/
//        System.out.println("最高分："+stu1.getMax());
//        System.out.println("最低分："+stu1.getMin());
        //对象数组
        Student students[] = new Student[5];
        students[0] =stu1;
        students[1] = stu2;
        students[2] = stu3;
        students[3] = stu4;
        students[4] = stu5;
        //各科成绩
        double java[]=new double[5];
        double js[]=new double[5];
        double mysql[]=new double[5];
        double max[]=new double[3];
        double min[]=new double[3];
        double avg[]=new double[3];
        for (int i=0; i<students.length; i++){
            //三门成绩分数
            java[i] =students[i].javaScore;
            js[i]=students[i].jsScore;
            mysql[i]=students[i].mysqlScore;
            //最大值
            max[0]= students[i].max(java);
            max[1]=students[i].max(js);
            max[2]= students[i].max(mysql);
            //最低分
            min[0] = students[i].min(java);
            min[1]=students[i].min(js);
            min[2] = students[i].min(mysql);
            //平均值
            avg[0]=students[i].avg(java);
            avg[1]=students[i].avg(js);
            avg[2]=students[i].avg(mysql);
        }
        System.out.println("Java的最高分："+max[0]);
        System.out.println("JS的最高分："+max[1]);
        System.out.println("mysql的最高分："+max[2]);
        System.out.println("Java的最低分："+min[0]);
        System.out.println("JS的最低分："+min[1]);
        System.out.println("mysql的最低分："+min[2]);
        System.out.println("Java平均值："+avg[0]);
        System.out.println("JS的平均值："+avg[1]);
        System.out.println("mysql的平均值："+avg[2]);
    }

}
