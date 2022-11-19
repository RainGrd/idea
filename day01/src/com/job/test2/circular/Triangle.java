package com.job.test2.circular;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/25 16:11:33
 * @description 三角形
 */
public class Triangle implements IShapeCompute {
    /*三角形的三条边、高、底*/
    int a,b,c;
    double height;
    double base;

    /**
     * 方法作用；判断三角形是否成立
     * 三角形的任意两条边，不能大于第三条边
     */
    public boolean isJudge(int a,int b,int c) {
        return judge=(a+b>c&&a+c>b&&b+c>a)?true : false;
    }

    /*判断三角形是否成立*/
    boolean judge;
    @Override
    public double getArea() {
        return Math.round(base*height)/2;
    }

    @Override
    public double getPerimeter() {
        return Math.round(a+b+c);
    }

    /**
     * 方法作用：判断三角形是否成立
     */
    @Override
    public void display() {
        System.out.println("三角形的周长:"+getPerimeter());
        System.out.println("三角形的面积:"+getArea());
    }
    public Triangle(int a,int b,int c,double height,double base){
        this.a = a;
        this.b = b;
        this.c = c;
        this.height=height;
        this.base = base;
        if (isJudge(a, b, c)) {
            System.out.println("三角形不成立！");
            /*暂停程序运行*/
            System.exit(1);
        }
    }
}
