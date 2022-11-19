package com.bdqn.job.demo2.work1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 19:54:33
 * @description: 主方法
 * @version: 1.0
 * @param：
 * 产生10个1~100的随机数，并放到一个数组中，把数组中大于等于10的数字放到一个
 * List集合中，并打印到控制台。
 */
public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        /*HashSet<Integer> set = new HashSet<>();
        while (set.size() == 10 ? true:false){
            int number=random.nextInt(100)+1;
            *//*添加数据*//*
            set.add(number);
        }
        Iterator<Integer> it = set.iterator();
        int count=0;
        while (it.hasNext()) {
            System.out.println("第"+count+++"个随机数="+it.next());
        }*/
        ArrayList<Integer> list=new ArrayList<>();
        while (list.size()>=10 ? false : true) {
            /*获取随机数*/
            int number=random.nextInt(100)+1;
            /*只要数据大于等于10放入list里面*/
            if(number>=10){
                list.add(number);
            }
        }
        /*打印输出*/
        System.out.println("随机抽取的数："+list);
    }
}
