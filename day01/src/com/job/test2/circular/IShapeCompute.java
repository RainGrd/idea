package com.job.test2.circular;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/25 14:37:43
 * @description
 * （1）接口ShapeCompute，包含抽象方法getArea()、getPerimeter()，用于计算图形的面积
 * 和周长，包含display()方法用于显示图形的信息。
 * （2）定义类Coordinates（坐标）、类Rectangle（矩形）、类Circle（圆形）和类Triangle（三
 * 角形）。
 * （3）类Circle继承Coordinates， Circle、 Rectangle、 Triangle类实现接口ShapeCompute 。
 * （4）定义Test类完成测试功能：生成各个形状的对象，调用对象的display()方法，输出对象
 * 的描述信息。
 */
public interface IShapeCompute {
    /*包含抽象方法getArea()、getPerimeter()，用于计算图形的面积
     * 和周长，包含display()方法用于显示图形的信息。*/
    double getArea();
    double getPerimeter();
    void display();
}
