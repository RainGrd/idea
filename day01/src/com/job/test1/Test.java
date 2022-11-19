package com.job.test1;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/22 14:48:55
 * @description 测试类
 */
public class Test {
    public static void main(String[] args) {
        //三角形
        Trangle trangle = new Trangle(2.0,2.0,3.0);
        //判断三角形是否成立
        if (trangle.isJudge()) {
            System.out.println("三角形的周长为："+trangle.getPerimete());
            System.out.println("三角形的面积为："+trangle.getArea());
        }else{
            System.out.println("三角形不成立！");
        }
        //梯形
        Lander lander = new Lander(24.0,36.0,12);
        System.out.println("梯形的面积为："+lander.getArea());
        //圆形
        Circle circle = new Circle(10.0);
        System.out.println("圆的周长:"+circle.getPerimeter());
        System.out.println("圆的面积:"+circle.getArea());

    }
    public float aMethod(float a, float b) {
        return 0;
    }
}
