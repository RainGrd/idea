package com.demo;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/26 10:59:44
 * @description 主方法
 */
public class OuterClass {
    //    private int age=20;
    private class Inner{
        public void show(){
            System.out.println("密码有备份文件！");
        }
    }
    public Inner getInner() {
        return new Inner();
    }
    public static void main(String[] args) {
        /*
          成员内部类不是静态的：
          外部类名.内部类名 对象名 = new 外部类名.new 内部类名();
          成员内部类是静态的：
          外部类名.内部类名 对象名 = new 外部类名.内部类名();
        */
//        OuterClass.Inner oi = new OuterClass.Inner();
//        oi.show();
        OuterClass outer=new OuterClass();
        OuterClass.Inner inner=outer.getInner();
        inner.show();
    }
}
class Test{
    public static void main(String[] args) {
        /*
          成员内部类不是静态的：
          外部类名.内部类名 对象名 = new 外部类名.new 内部类名();
          成员内部类是静态的：
          外部类名.内部类名 对象名 = new 外部类名.内部类名();
        */
//        OuterClass.Inner oi = new OuterClass.Inner();
//        oi.show();
    }
}
