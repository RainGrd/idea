package com.job.demo2;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/24 11:37:35
 * @description 企鹅类
 */
public class Penguin extends Pet{
    private String sex;
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    /**
     * 初始化数据
     *
     * @param name
     * @param health
     * @param love
     */
    public Penguin(String name, int health, int love,String sex) {
        super(name, health, love);
        this.sex = sex;
    }
    /**
     * 重写父类的打印方法
     * 通过this关键获取父类的定义的私有属性
     */
    @Override
    public void print(){
        super.print();
        System.out.println("企鹅的年龄："+this.getSex());
    }
}
