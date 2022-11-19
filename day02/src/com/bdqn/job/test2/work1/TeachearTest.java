package com.bdqn.job.test2.work1;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author: duan.rong.gui
 * @date: 2022/4/1 9:46:55
 * @description: 主方法
 * @version: 1.0
 * @param：
 */
public class TeachearTest {
    public static void main(String[] args) {
        /*生成对象并进行初始化*/
        Teacher t1 = new Teacher("王衡", 34, 6000.0);
        Teacher t2 = new Teacher("祝小艳", 44, 20000.0);
        Teacher t3 = new Teacher("李雪", 25, 6000.0);
        Teacher t4 = new Teacher("郑强", 44, 15000.0);

        HashSet<Teacher> set=new HashSet<>();
        set.add(t1);
        set.add(t2);
        set.add(t3);
        set.add(t4);
        /*使用迭代器遍历*/
        Iterator<Teacher> it=set.iterator();
        double sum=0;
        /*所有教师的工资总和 */
        while (it.hasNext()) {
            sum+=it.next().getSalary();
        }
        System.out.println("所有教师的薪水总和："+sum);
    }

}
