package com.job.demo3;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/26 20:14:24
 * @description 主方法
 */
public class SystemTest {
    public static void main(String[] args) {
        int[] srcArray ={1,2,3,4};
        int[] destArray = {1,2,3,4};
        /*复制数组*/
        System.arraycopy(srcArray, 1, destArray,1 , 2);
        for (int i = 0; i < srcArray.length; i++) {
            System.out.println(srcArray[i]);
        }
        System.out.println("目标数组：");
        for (int j = 0; j < destArray.length; j++) {
            System.out.println(destArray[j]);
        }
        long m=System.currentTimeMillis();
        System.out.println(m);
        /*版本号*/
        System.out.println(System.getProperty("java.version"));
        /*Java的安装目录*/
        System.out.println(System.getProperty("java.home"));
        /*操作系统的名称*/
        System.out.println(System.getProperty("os.name"));
        /*操作系统的版本*/
        System.out.println(System.getProperty("os.version"));
        /*用户的账户名称*/
        System.out.println(System.getProperty("user.name"));
        /*用户的主目录*/
        System.out.println(System.getProperty("user.home"));
        /*用户的当前工作目录*/
        System.out.println(System.getProperty("user.dir"));
    }
}
