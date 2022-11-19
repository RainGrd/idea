package com.bdqn.demo2.demo1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 16:11:33
 * @description: 主方法
 * @version: 1.0
 * @param：
 */
public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        /**/
        Iterator<String> it=list.iterator();
        while (it.hasNext()) {
            /*下一个元素*/
            String s=it.next();
            System.out.print(s+" ");
            if(s.equals("3")){
                it.remove();
            }
        }
        System.out.println();
        it=list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }
    }
}
