package com.bdqn.job.test3;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * @param：
 */
public class BadDataException extends Exception{
    /*读取没一行的内容*/
    private int line;
    public BadDataException(int line) {
        /*初始化*/
        super();
        this.line = line;
    }

    @Override
    public String toString() {
        return "当前读取到第"+line+"行,读取的数不是浮点数";
    }
    @Override
    public String getMessage(){
        return "当前读取到第"+line+"行,读取的数不是浮点数";
    }
}
