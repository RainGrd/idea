package com.job.test2.theme;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/29 10:18:24
 * @description 手机类
 */
public class Phone implements ITheme{
    private String theme;
    @Override
    public String getTheme() {
        return theme;
    }

    @Override
    public void setTheme(String theme) {
        this.theme = theme;
    }
    /**
     *方法作用：初始化数据
     */
    public Phone(String theme){
        this.theme = theme;
    }
}
