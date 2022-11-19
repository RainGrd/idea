package com.job.test1;

import java.awt.*;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/23 8:55:02
 * @description 测试
 */
public class TestRectangle {
    public static void main(String[] args) {
        //测试
        Rectangle r1= new Rectangle(10,50, Color.red,100,200);
        r1.display();
        Rectangle r2= new Rectangle(new Point(1,1),Color.red,5,6);
        r2.display();
        //调用方法来显示数据
        r2.move(2,2);
        r2.change(7,8);
        r2.setColor(Color.blue);
        r2.display();

    }
}
