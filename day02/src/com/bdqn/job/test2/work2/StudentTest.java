package com.bdqn.job.test2.work2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author: duan.rong.gui
 * @date: 2022/4/1 15:51:39
 * @description: 主方法
 * @version: 1.0
 * @param：
 * 定义一个Student类，包含三个属性：name、age、sid（学号）。添加toString()方法，对
 * 象显示的字符串为sid:×××××,name:××××,age:××。其他方法根据需要自己设置。
 * 创 建5个学生并添加到HashMap中， 使用sid作为Map的 主 键。 使 用 两 种 方 法 遍 历
 * HashMap中的所有学生。
 */
public class StudentTest {
    public static void main(String[] args) {
        /*初始化数据*/
        Student stu1 = new Student("段荣贵", 16, "001");
        Student stu2 = new Student("周珩", 17, "002");
        Student stu3 = new Student("杨鑫", 17, "003");
        Student stu4 = new Student("段荣贵", 16, "001");
        Student stu5 = new Student("周珩", 17, "004");
        /*初始化数据*/
        HashMap<String,Student> map=new HashMap<>();
        /*添加主键*/
        map.put(stu1.getSid(),stu1);
        map.put(stu2.getSid(),stu2);
        map.put(stu3.getSid(),stu3);
        map.put(stu4.getSid(),stu4);
        map.put(stu5.getSid(),stu5);
        /*使用迭代器遍历*/
        Iterator<Map.Entry<String, Student>> it=map.entrySet().iterator();
        System.out.println("使用迭代器遍历");
        while (it.hasNext()) {
            System.out.println(it.next().getValue());
        }

        /*使用foreach遍历*/
        System.out.println("使用foreach遍历");
        for(Map.Entry<String,Student> entry:map.entrySet()){
            System.out.println(""+entry.getValue());
        }
    }

}
