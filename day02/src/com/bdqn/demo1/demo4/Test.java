package com.bdqn.demo1.demo4;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/29 11:21:10
 * @description 主方法
 */
public class Test {
    public static void main(String[] args) {
        ProductGetter<String> product = new ProductGetter<>();
        /*奖品池*/
        String [] strProducts={"苹果手机","微波炉","华为手机"};
        for (int i = 0; i < strProducts.length; i++) {
            /*添加数据*/
            product.addProduct(strProducts[i]);
        }
        /*输出抽中的结果*/
        System.out.println("你抽中了:"+product.getProduct());
        System.out.println("------------------------------");
        /*具体的物品*/
        ProductGetter<Integer> integerProductGetter=new ProductGetter<>();
        int []integerProducts={10000,5000,6000,3000};
        for (int i = 0; i < integerProducts.length; i++) {
            /*添加数据*/
            integerProductGetter.addProduct(integerProducts[i]);
        }
        /*显示抽出的结果*/
        System.out.println("恭喜你!你抽中了"+integerProductGetter.getProduct()+"元");
    }
}
