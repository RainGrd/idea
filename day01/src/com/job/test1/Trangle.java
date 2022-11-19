package com.job.test1;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/22 10:54:35
 * @description
 * 返回周长、面积以及设置和获取三条边的功能。
 * 判断三个数能否构成一个三角形
 */
public class Trangle {
    double a=0;//第一条边
    double b=0;//第二条边
    double c=0;//第三条边
    double perimeter;    //周长
    double area;    //面积
    boolean judge;  //判断三角形是否成立
    public double getPerimete() {
        return perimeter;
    }

    public void setPerimete() {
        //三角形周长=三条边长之和
        this.perimeter = this.a+this.b+this.c;
    }

    public double getArea() {
        return area;
    }

    public void setArea() {
        //三角形的面积公式：底×高÷2 area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        //先求三角形的半周长
        double p= this.perimeter/2;
        //Math.sqrt()返回正确舍入的 double 值的正平方根
        this.area = Math.round(Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c)));
    }

    public boolean isJudge() {
        return judge;
    }

    public void setJudge() {
        this.judge = (this.a+this.b>this.c&&this.a+this.c>this.b&&this.b+this.c>this.a)?true:false;
    }
    public Trangle(double one,double two,double three){
        this.a=one;
        this.b = two;
        this.c=three;
        //调用三角形的判断方法
        setJudge();
        //获取周长
        setPerimete();
        setArea();
    }
}
