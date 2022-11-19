package com.bdqn.demo1.demo3;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/29 9:30:57
 * @description 主方法
 */
public class Test {
    public static void main(String[] args) {
        /*ArrayList list = new ArrayList();
        list.add("java");
        list.add(100);
        list.add(true);
        for(int i = 0; i <list.size(); i++){
            System.out.println(list.get(i).toString());
        }*/
        /*泛型类在创建对象的时候，来指定操作的具体操作类型*/
        Generic<String> strGeneric=new Generic<>("钥匙");
        String key1=strGeneric.getKey();
        System.out.println("key1:"+key1);
        Generic<Integer> intGeneric=new Generic<>(1);
        System.out.println("------------------------");
        /*自动拆箱*/
        int key2 = intGeneric.getKey();
        System.out.println("key2:"+key2);
        System.out.println("------------------------");
        /*泛型类在创建对象是，没有指定数据类型的话，默认为Object*/
        Generic generic = new Generic("abc");
        Object key3=generic.getKey();
        System.out.println("key3:"+key3);
        System.out.println("------------------------");
        System.out.println(intGeneric.getClass());
        System.out.println(strGeneric.getClass());
        System.out.println(intGeneric.getClass() == strGeneric.getClass());
    }
}
