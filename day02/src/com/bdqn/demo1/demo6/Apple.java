package com.bdqn.demo1.demo6;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/29 19:22:10
 * @description: 主方法
 * @version: 1.0
 * @param：
 * 1.指定范新接口的参数类型
 */
public class Apple implements IGenerator<String>{
    @Override
    public String getKey() {
        return "hello generic";
    }
}
