package com.bdqn.job.demo2.work2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 20:10:03
 * @description: 主方法
 * @version: 1.0
 * @param：
 * 已知数组存放一批QQ号码，QQ号码最长为11位，最短为5位，String[] strs = {"12345","2
 * 32391","12345678901","12345678901","63231","12347809933"}。将该数组里的所有QQ号码都存
 * 放在LinkedList中，然后删除重复元素，再将所有元素分别用Iterator和foreach循环打印出来
 */
public class Test {
    public static void main(String[] args) {
        /*存储的QQ号码*/
        String[] strs = {"12345","232391","12345678901","12345678901","63231","12347809933"};
        LinkedList<String> strList = new LinkedList<>();
        ArrayList list=new ArrayList();
        /*存放在LinkedList中*/
        for (int i = 0; i < strs.length; i++) {
            strList.add(strs[i]);
        }
        /*使用双重循环输出重复元素*/
        for (int i = 0; i < strList.size(); i++) {
            for (int j = i+1; j < strList.size(); j++) {
                if (strList.get(i)==strList.get(j)){
                    strList.remove(j);
                    j--;
                }
            }
        }
        /*使用迭代器遍历输出*/
        Iterator<String> it=strList.iterator();
        String str="";
        while (it.hasNext()) {
            str = it.next();
            System.out.print(str+" ");
        }
        System.out.println();
        /*使用foreach遍历输出*/
        for (String s : strList) {
            System.out.print(s+" ");
        }
    }
}
