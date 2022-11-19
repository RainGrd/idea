package com.wrap.demo1;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/24 14:49:23
 * @description static关键字的应用
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle(3.4);
        System.out.println("c1的id:"+c1.getId());
        System.out.println("c2的id:"+c2.getId());
        System.out.println("c3的id:"+c3.getId());
        System.out.println("创建圆的个数:"+Circle.getTotal());
        System.out.println("c3的面积"+c3.findArea());
    }
}
class Circle{
    /*私有的圆半径*/
    private double radius;
    /*私有的圆的编号且自动赋值*/
    private int id;
    /*创建圆对象的个数*/
    private static int total;
    /*用于编号自增*/
    private static int init=1001;
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Circle.total = total;
    }


    /**
     *
     *方法作用：计算圆的面积
     *
     */
    public double findArea(){
        return Math.round(Math.PI*(radius*radius));
    }

    /**
     * 方法作用：定
     */
    public Circle(){
        /*通过static的特性：多个对象共享此静态变量*/
        id=init++;
        total++;
    }
    /**
     *
     *方法作用：重载构造方法
     */
    public Circle(double radius){
        /*调用本类的无参构造方法*/
        this();
        this.radius = radius;
    }

}
