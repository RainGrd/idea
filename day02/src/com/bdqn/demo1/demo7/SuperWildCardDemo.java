package com.bdqn.demo1.demo7;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/30 7:11:37
 * @description: 主方法
 * @version: 1.0
 * @param：
 */
public class SuperWildCardDemo {
    /**
     * 方法作用：统计容器中未被使用的空间个数，使用通配符
     */
    public static int countNullElements1(GenericContainer<?> container){
        int count=0;
        for(int i = 0; i < container.getSize(); i++){
            if (container.get(i)==null) {
                count++;
            }
        }
        return count;
    }

    /**
     * 方法作用：统计容器中未被使用的空间个数，使用上限通配符只是继承ChildClass的子类
     */
    public static int countNullElements2(GenericContainer< ? extends ChildClass> container){
        int count = 0;
        for (int i = 0; i < container.getSize(); i++) {
            if (container.get(i) == null) {
                count++;
            }
        }
        return count;
    }

    /**
     * 方法作用：统计容器中未被使用的空间个数，使用下限通配符只能是父类ChildClass及其以上的父类
     */
    public static int countNullElements3(GenericContainer<? super ChildClass> container){
        int count = 0;
        for (int i = 0; i < container.getSize(); i++) {
            if (container.get(i) == null) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        /*定义三个容器对象*/
        /*创建存放父类元素的容器*/
        /*创建存放子类的子类元素的容器*/
        GenericContainer<SuperClass> supercounter=new GenericContainer<>(5);
        GenericContainer<ChildClass> childcounter = new GenericContainer<>(3);
        /*创建子类的子类元素的容器*/
        GenericContainer<GrandChildClass> grandchildcontainer = new GenericContainer<>(2);
        /*调用countNullElements1方法*/
        System.out.println(countNullElements1(supercounter));
        System.out.println(countNullElements1(childcounter));
        System.out.println(countNullElements1(grandchildcontainer));
        /*调用countNullElements2方法*/
//        System.out.println(countNullElements2(supercounter));
        System.out.println(countNullElements2(childcounter));
        System.out.println(countNullElements2(grandchildcontainer));
        /*调用countNullElements3方法*/
        System.out.println(countNullElements3(supercounter));
        System.out.println(countNullElements3(childcounter));
//        System.out.println(countNullElements3(grandchildcontainer));
    }
}
