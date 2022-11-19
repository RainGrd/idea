package com.wrap.demo1;

import org.junit.Test;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/21 16:29:47
 * @description 主方法
 */
public class WrapperTest {
    /**
     * @author: duanronggui
     * @param:
     * @retrun:
     * @description 方法作用
     */
    @Test
    public void test1(){
        int num1=10;
        //利用int参数创建的Integer对象
        Integer in1 = new Integer(num1);
        System.out.println(in1);
        //利用String参数创建的Integer对象
        Integer in2 = new Integer("123");
        System.out.println(in2);

        Float f1 = new Float(12.3);
        Float f2 = new Float("12.3");
        /*
        注意事项：
        1.String 参数只能是数字。比如：”123“,否则会报错
        2.除了Boolean和Character属于object类,其他都是Number的子类，所以它们都是一样写法和用法
        3.Boolean的参数取值，只能是true和false，否则会返回一个false
        * */
        System.out.println(f1);
        System.out.println(f2);
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("true");
        Boolean b3 = new Boolean("123");
        System.out.println(b3);
        Order order = new Order();
        System.out.println(order.isMale);   //false
        System.out.println(order.isFeMale);//null
    }
    /**
    *
    * @author: duanronggui
    * @param:
    * @retrun:
    * @description 包装类装换为基本数据类型
    */
    @Test
    public void test2(){
        Integer in1=new Integer(12);
        int i1= in1.intValue();     //返回一个int的值
        System.out.println(i1+1);
        Float f1 = new Float(12.3);
        float f2 = f1.floatValue(); //获取Float的值
        System.out.println(f2);
    }
    /**
    *
    * @author: duanronggui
    * @param: 自动拆箱和自动装箱
    * @retrun:
    * @description
    */
    @Test
    public void test3() {
//        int num1=10;
        //jdk5.0新特性 自动装箱和自动拆箱
        //转换为
//        method(num1);
        //自动装箱
        int num2=10;
        Integer in1=num2;
        boolean b1=true;
        Boolean b2=b1;
        //自动拆箱  包装类转换为基本数据类型
        int  num3= in1;
    }
    //基本数据类型、包装类--->转换为String类型
    @Test
    public void test4() {
        int num1=10;
        //方式1：强制转换
        String str1=num1+"";   //
        //方式2：调用String重载的ValueOf方法
        float f1=12.3f;
        String str2 = String.valueOf(f1);   //"12.3"

        Double d1=new Double(12.4);
        String str3= String.valueOf(d1);
        System.out.println(str2);
        System.out.println(str3);
    }
    //String类型--->基本数据类型、包装类
    @Test
    public void test5() {
        String str1="123";
//      int num1=(int)str1;
//      Integer in1=(Integer)str1;
        //方法1：调用包装类的parsetXxx()
        int num= Integer.parseInt(str1);
        System.out.println(num);
        String str2="true";
        boolean b1=Boolean.parseBoolean(str2);
        System.out.println(b1);
    }


    public void method(Object obj){

    }
}
class Order{
    boolean isMale;
    Boolean isFeMale;
}
