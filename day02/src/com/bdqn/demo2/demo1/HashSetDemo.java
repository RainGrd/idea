package com.bdqn.demo2.demo1;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 18:52:52
 * @description: 主方法
 * @version: 1.0
 * @param：
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);
        /*使用迭代器遍历*/
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            int item = it.next();
            System.out.print(item+" ");
        }
        System.out.println("\n使用foreach遍历");
        /*使用foreach进行遍历*/
        for(Integer item : set){
            System.out.print(item+" ");
        }
    }
}
