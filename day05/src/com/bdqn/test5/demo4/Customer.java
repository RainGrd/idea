package com.bdqn.test5.demo4;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class Customer implements Runnable {
    private Box box;
    public Customer(Box box) {
        this.box=box;
    }

    @Override
    public void run() {
        /*调用获取牛奶的操作*/
        while (true){
            box.get();
        }
    }
}
