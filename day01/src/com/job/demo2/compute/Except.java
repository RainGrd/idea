package com.job.demo2.compute;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/24 16:46:43
 * @description 除
 */
public class Except implements Compute{

    @Override
    public int compute(int n, int m) {
        return n/m;
    }
}
