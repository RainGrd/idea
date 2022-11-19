package com.bdqn.demo2.demo1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 15:33:43
 * @description: 主方法
 * @version: 1.0
 * @param：
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(3);
        /*判断是否*/
        if(list.contains(5)){
            System.out.println("包含元素5");
        }else{
            System.out.println("不包含元素5");
        }
        System.out.println(list);
        /*删除值为2的元素*/
        list.remove(new Integer(2));
        /*删除第二个元素*/
        list.remove(2);
        System.out.println(list);
        System.out.println(list.lastIndexOf(3));

        /*删除值为3的元素*/
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)==3){
                list.remove(i);
            }
        }
        System.out.println(list);
        Iterator<Integer> iterator = list.iterator();
        System.out.println(iterator.next());

    }
}
