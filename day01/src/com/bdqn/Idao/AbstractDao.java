package com.bdqn.Idao;

/**
 * @author: 段荣贵
 */
public  abstract  class  AbstractDao implements IDAO{
    //抽象类实现接口就可以重写方法了
    @Override
    public void add() {
        System.out.println("增加");
    }
    @Override
    public void delete() {
        System.out.println("删除");
    }
    @Override
    public void upddate() {
        System.out.println("更新");
    }
    @Override
    public void select() {
        System.out.println("查询");
    }
}
