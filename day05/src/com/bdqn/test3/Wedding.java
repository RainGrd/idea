package com.bdqn.test3;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class Wedding implements Marry {
    private Marry target;

    public Wedding(Marry target) {
        this.target = target;
    }

    @Override
    public void happyMarry() {
        /**/
        after();
        this.target.happyMarry();
        before();

    }

    private void after() {
        System.out.println("布置婚礼现场！");
    }

    /**
     * @param
     * @return void
     * @author 段荣贵
     * @description //TODO 肖萧奈何桥
     * @date 7:35:48 2022/4/10
     * 方法描述：
     **/
    private void before() {
        System.out.println("结婚之后收尾款");
    }
}
