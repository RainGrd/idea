package com.bdqn.test5.demo4;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class Producer implements Runnable {
    private Box box;

    public Producer(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        /*调用存储牛奶的操作*/
        for (int i = 1; i <= 30; i++) {
            box.put(i);
        }
    }
}
