package com.wrap.dome2;

import org.junit.Test;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/28 15:09:51
 * @description 主方法
 */
public class EnumTest {
    /*定义周一到周日的常量*/
    enum Day{
        MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    @Test
    public void test1(){
        Day day=Day.MONDAY;
        System.out.println(day);
    }
}
