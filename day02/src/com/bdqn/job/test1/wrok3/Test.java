package com.bdqn.job.test1.wrok3;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 9:43:30
 * @description: 主方法
 * @version: 1.0
 * @param：
 */
public class Test {
    public static void main(String[] args) {
        Container<String> container = new Container<>(5);
        /*插入数据*/
        container.insert(0,"段荣贵");
        container.insert(1,"周珩");
        container.insert(2,"阿飞");
        container.insert(3,"阿卜");
        container.insert(4, "老谭");
        container.insert(5, "无");
        container.insert(6,"周珩");
        /*打印输出*/
        System.out.print("打印输出：");
        container.forElement();
        /*删除数据*/
        container.delete(5);
        /*打印输出*/
        System.out.print("删除后的元素：");
        container.forElement();
        /*获取指定元素*/
        System.out.print("获取指定位置的元素：");
        System.out.println(container.getElement(4));
        /*替換指定索引的元素*/
//        container.replaceElement(1,"傻珩");
        /*打印输出*/
//        System.out.print("打印输出：");
//        container.forElement();
        System.out.println("替换全部字符串");
        container.replaceAll("周珩","傻珩");
        System.out.print("打印输出：");
        container.forElement();
    }
}
