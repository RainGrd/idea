package com.bdqn.demo1.demo4;

import java.util.ArrayList;
import java.util.Random;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/29 11:21:52
 * @description 主方法
 * @param :抽奖类
 * 1.定义泛型类
 */
public class ProductGetter <T>{
    Random random=new Random();
    /*奖品*/
    private T product;
    /*用来确定是否是奖金还是物品*/
    ArrayList<T> list=new ArrayList<>();

    /**
     * 方法作用：用于传入具体的数据，并添加到ArrayList里进行抽奖
     */
    public void addProduct(T value){
        list.add(value);
    }

    /**
     * 方法作用：返回抽奖的结果
     */
    public T getProduct() {
        /*定义抽奖的范围*/
        product= list.get(random.nextInt(list.size()));
        return product;
    }
    @Override
    public String toString() {
        return "ProductGetter{" +
                "product=" + product +
                '}';
    }
}
