package com.bdqn.demo1.demo7;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/29 20:46:56
 * @description: 主方法
 * @version: 1.0
 * @param：
 */
public class GenericContainer<T> {
    private Object []t;
    /*容器大小*/
    private int size;
    private int length;
    public GenericContainer(int size) {
        this.size = size;
        t=new Object[size];
        length = 0;
    }
    public T get(int index){
        return (T) t[index];
    }
    public void add(T value){
        t[length]=value;
        length++;
    }
    public int getSize(){
        return size;
    }
}
