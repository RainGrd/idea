package com.bdqn.demo1;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/28 17:17:02
 * @description
 * 一、定义枚举类
 * 方式一：jdk5.0之前，自定义枚举类
 * 方式二：jdk5.0之后，可以使用enum关键字
 * 二、Enum类中的常用方法
 * values():返回枚举类型的对象数组，该方法可以很方便的遍历所有的枚举值
 * valueof(String str)：可以把一个字符串转为对应的枚举类对象，要求字符串必须是枚举类对象
 * toString():返回当前枚举类对象常量的名称
 *  三、使用enum关键字定义接口
 *  1.使用接口，在enum类实现抽象方法
 *  2.让枚举类的对象分别实现接口中的抽象方法
 *
 */
public class SeasonTest {
    public static void main(String[] args) {
        Season spring= Season.SPRING;

        System.out.println(spring);

    }
}
/*自定义枚举类*/
class Season{
    /*1.声明对象的属性:private final关键字修饰*/
    private final String seasonName;
    private final String seasonDesc;

    /*2.私有化构造器,并给属性初始化*/
    private Season(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
    /*3.提供当前枚举类的多个对象：注意事项使用 public static final关键修饰的*/
    public static final Season SPRING=new Season("春天","春暖花开");
    public static final Season SUMMER=new Season("夏天","夏日炎炎");
    public static final Season AUTUMN=new Season("秋天","秋高气爽");
    public static final Season WINTER=new Season("冬天","白雪皑皑");
    /*4.其他诉求1：获取其他枚举类的属性*/
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
    /*4.其他诉求2：提供toString方法*/

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
