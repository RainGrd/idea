package com.bdqn.demo1;

import java.util.Scanner;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：测试类
 */
public class Test {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
       /* Student s1 = new Student(1, "段荣贵", 17, "男");
        Student s2 = new Student(2, "周珩", 18, "男");*/

        /*添加数据*/
//        dao.add(s1);
//        dao.add(s2);
        /*查询数据*/
//        dao.query(s1);
        System.out.println("欢迎使用学生管理系统！");
        System.out.println("------------------------");
        Test test = new Test();
        test.getOption();
    }

    /**
     * @param
     * @return 方法描述：用于获取选项
     * @author 段荣贵
     * @description //TODO 肖萧奈何桥
     * @date 9:19:42 2022/4/8
     **/
    public void getOption() {
        /*创建接口*/
        IStudentDAO dao = new StudentDAOImpl();
        int op =0;
        do {
            System.out.println("1.查询学生 2.添加学生 3.修改学生信息 4.删除学生");
            op= input.nextInt();
            switch (op) {
                case 1:
                    dao.query();
                    break;
                case 2:
                    /*添加数据*/
                    dao.add(getStudentInfo());
                    break;
                case 3:
                    /*修改数据*/
                    dao.update(getStudentInfo());
                case 4:
                    /*删除数据*/
                    System.out.println("1.查询学生 2.添加学生 3.修改学生信息 4.删除学生");
                    System.out.println("请输入你要删除的学生的学号:");
                    int deleteId=input.nextInt();
                    dao.delete(deleteId);
                    break;
                default:
                    System.out.println("请重新输入：");
                    break;
            }
        } while (true);
    }
    /**
     * @author 段荣贵
     * @description //TODO 肖萧奈何桥
     * @date 9:40:58 2022/4/8
     * @param 
     * @return 
     * 方法描述：用于获取学生的个人信息
     **/
    public Student getStudentInfo(){
        System.out.println("请输入学生学号：");
        int id=input.nextInt();
        System.out.println("请输入学生姓名：");
        String name=input.next();
        System.out.println("请输入学生年龄：");
        int age=input.nextInt();
        System.out.println("请输入学生性别(1.男 2.女):");
        int sex=input.nextInt();
        /*返回学生对象*/
        return new Student(id,name,age,sex);
    }
}
