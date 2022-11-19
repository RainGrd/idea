package com.bdqn.demo1;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/28 19:16:00
 * @description 使用enum关键字定义枚举类
 * 定义枚举类默认继承Java.lang.Enum
 *  一、定义枚举类
 *  方式一：jdk5.0之前，自定义枚举类
 *  方式二：jdk5.0之后，可以使用enum关键字
 *  二、Enum类中的常用方法
 *  values():返回枚举类型的对象数组，该方法可以很方便的遍历所有的枚举值
 *  valueof(String str)：可以把一个字符串转为对应的枚举类对象，要求字符串必须是枚举类对象
 *  toString():返回当前枚举类对象常量的名称
 *
 *
 */
public class Season1Test1 {
    public static void main(String[] args) {
        Season1 summer = Season1.SUMMER;
        /*1.toString方法演示*/
        System.out.println(summer);
        System.out.println("**************");
        /*2.values()*/
        Season1[] values = Season1.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        /*3.valueOf(String objName):根据提供的objName,返回与ObjName同名的对象*/
        Season1 winter = Season1.valueOf("WINTER");
        System.out.println(winter);
        /*获取Season1类的父类*/
//        System.out.println(Season1.class.getSuperclass());
        winter.show();
    }
}
interface Info{
    void show();
}
/*自定义枚举类*/
enum  Season1 implements Info{
    /*1.提供当前枚举类的对象，多个对象之间用","隔开，末尾对象用分号";"结束*/
    SPRING("春天","春暖花开"){
        @Override
        public void show() {
            System.out.println("春天在哪里");
        }
    },
    SUMMER("夏天","夏日炎炎"){
        @Override
        public void show() {
            System.out.println("宁夏");
        }
    },
    AUTUMN("秋天","秋高气爽"){
        @Override
        public void show() {

            System.out.println("秋天不回来");
        }
    },
    WINTER("冬天","白雪皑皑"){
        @Override
        public void show() {
            System.out.println("大约在冬季");
        }
    };
    /*2.声明对象的属性:private final关键字修饰*/
    private final String seasonName;
    private final String seasonDesc;

    /*2.私有化构造器,并给属性初始化*/
    private Season1(String seasonName, String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
    /*3.其他诉求1：获取其他枚举类的属性*/
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    /*@Override
    public void show() {
        System.out.println("这是一个季节");
    }*/
    /*4.其他诉求2：提供toString方法*/

    /*@Override
    public String toString() {
        return "Season1{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }*/
}

