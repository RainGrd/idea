package com.job.test4.work1;

import com.job.demo2.BaseLoan;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/27 14:05:18
 * @description 主方法
 */
public class Packed {
    public static void main(String[] args) {
        /*完成基本数据类型和包装类之间的转换*/
        Integer integer = new Integer(10);
        /*自动拆箱*/
        int number=integer;
        System.out.println("Integer转换为int:"+number);
        /*自动装箱*/
        integer=number+1;
        System.out.println("int转换为Integer:"+integer);
        Double aDouble = new Double(10);
        double ad=aDouble;
        System.out.println("Double转换为double:"+ad);
        aDouble=ad+1;
        System.out.println("double转换为Double:"+aDouble);
        Float fl=new Float(34.0);
        /*自动拆箱*/
        float flo=fl;
        System.out.println("Float转换为float:"+flo);
        /*自动装箱*/
        fl=flo;
        System.out.println("float转换为Float:"+fl);

        /*Boolean转换为boolean*/

        Boolean bool=new Boolean(true);
        /*自动拆箱*/
        boolean flag=bool;
        System.out.println("Boolean转换为boolean："+flag);
        flag=false;
        bool=flag;
        System.out.println("boolean转换为Boolean："+bool);
        /*char转换为Character*/
        char ch='a';
        Character character = new Character(ch);
        ch=character;
        System.out.println("Character转换为char:"+ch);
        character=new Character('b');
        System.out.println("char转换为Character:"+character);
    }
}
