package com.job.demo1;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/22 18:58:27
 * @description 测试Shirt类
 * 用来生成具有衣领尺寸和袖子长度的Shirt类的
 * 对象。然后显示包括材料在内的所有衬衫的数据。
 */
public class TestShirt {
    public static void main(String[] args) {

        Shirt s1 = new Shirt(100, 500);
        s1.showInfo();
        Shirt s2 = new Shirt(150, 500);
        s2.showInfo();
    }
}
