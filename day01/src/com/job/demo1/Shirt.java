package com.job.demo1;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/22 18:52:47
 * @description 主方法
 */
public class Shirt {
    //衣领尺寸
    double size=0;
    //袖子长度
    double length=0;
    //材料
    String material="cotton";
    public Shirt(double s,double l){
        this.size = s;
        this.length = l;
    }
    //显示包括材料在内的所有衬衫的数据。
    public void showInfo(){
        System.out.println("衣领尺寸:"+size + "\t袖子长度:"+length+"\t材料:"+material);
    }
}
