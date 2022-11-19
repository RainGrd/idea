package com.bdqn.job.test1.wrok3;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/30 16:03:25
 * @description: 主方法
 * @version: 1.0
 * @param： 使用泛型编写程序，定义一个能存储若干指定类型数据的容器。容器能够在指定位置添
 * 加、删除元素，能够获得指定位置元素，能够遍历容器中的所有元素并输出。
 * 提示：仿照11.2.1小节中的Box定义Container类，Container字 段 为 泛 型 类 型 数 组， 在
 * Container类中定义构造方法、添加、删除、遍历和获得指定位置元素的方法，元素指定位置
 * 从1开始。
 */
public class Container<T> {
    /*元素数组*/
    private Object element[];
    /*容器大小*/
    private int size;
    /*大小长度*/
    private int length;

    /**
     * 方法作用：初始化数据
     */
    public Container(int size) {
        this.size = size;
        element = new Object[size];
        length = 0;
    }

    /**
     * 方法作用：添加元素
     */
    public boolean insert(int index, T ele) {
        if (index > this.length) {
            return false;
        }
        /*增加长度*/
        if (this.length >= this.size) {
            Object[] new_date = new Object[this.size + this.length];
            /*利用System的复制数组方法*/
            System.arraycopy(element, 0, new_date, 0, this.length);
            element = new_date;
            /*替换长度*/
            this.size = new_date.length;
        }

        /*开始插入数据*/
        for (int i=this.length; i > index; i--)
            /*将数据外后移*/
            element[i] = element[i-1];
            /*添加元素*/
            element[index]=ele;
            /*增加长度*/
            this.length++;
            /*返回*/
            return true;
    }

    /**
     * 方法作用：根据索引删除元素
     */
    public boolean delete(int index) {
        boolean flag=false;
        if (index > this.length-1) {
            System.out.println("索引超出！");
            /*终止运行*/
//            flag = false;
            System.exit(1);
        }
        /*删除数据*/
        for (int i =index; i <this.length; i++) {
            element[i] = element[i+1];
            this.length--;
            flag=true;
        }
        return flag;
    }

    /**
     * 方法作用：遍历输出
     */
    public void forElement() {
        for (int i = 0; i < length; i++) {
            System.out.print(element[i] + " ");
        }
        System.out.println();
    }

    /**
     * 方法作用：获得指定元素的方法
     */
    public T getElement(int index) {
        /*先判断指定元素的索引是否超出索引*/
        if (index > element.length - 1) {
            return null;
        } else {
            return (T) element[index];
        }
    }
    /*根据指定索引替换元素*/
    public boolean replaceElement(int index,T e){
        boolean flag = false;
        if (index > this.length-1) {
            flag=false;
        }
        /*根据*/
        for (int i = index; i < element.length; i++) {
            element[index] = e;
            flag=true;
        }
        return flag;
    }
    /*根据旧字符串出现的位置替换元素*/
    public void replaceAll(T oldEle,T newEle){
        boolean flag = false;
        /*先获取旧的字符串在element出现的索引*/
        for (int i = 0; i < element.length; i++) {
            if (element[i] == oldEle) {
                element[i] = newEle;
            }
        }
    }
}
