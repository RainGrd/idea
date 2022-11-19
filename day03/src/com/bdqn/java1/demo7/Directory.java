package com.bdqn.java1.demo7;

import java.io.File;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: Ã¤Â¸Â»Ã¦ÂÂ¹Ã¦Â³Â
 * @version: 1.0
 * Ã§Â±Â»Ã¦ÂÂÃ¨Â¿Â°Ã¯Â¼ÂÃ©ÂÂÃ¨Â¿ÂÃ©ÂÂÃ¥Â½ÂÃ©ÂÂÃ¥ÂÂÃ§ÂÂ®Ã¥Â½Â
 */
public class Directory {
    public static void main(String[] args) {

        /*Ã¦ÂÂÃ¤Â»Â¶Ã§ÂÂ®Ã¥Â½ÂÃ¨Â·Â¯Ã¥Â¾Â*/
        String path="D:\\Ã¥Â­Â¦Ã¤Â¹Â Ã¨ÂµÂÃ¦ÂÂ\\Java";
        File file = new File(path);
        /*Ã¨Â°ÂÃ§ÂÂ¨Ã¨Â¿ÂÃ¤Â¸ÂªÃ¦ÂÂ¹Ã¦Â³Â*/
        getAllFile(file);
    }
    /**
     * @author Ã¦Â®ÂµÃ¨ÂÂ£Ã¨Â´Âµ
     * @description //TODO
     * @date 16:23:41 2022/4/6
     * @param 
     * @return 
     * Ã¦ÂÂ¹Ã¦Â³ÂÃ¦ÂÂÃ¨Â¿Â°Ã¯Â¼ÂÃ¨ÂÂ·Ã¥ÂÂÃ¦ÂÂ¢Ã¥Â®ÂÃ§ÂÂ®Ã¥Â½ÂÃ¤Â¸ÂÃ§ÂÂÃ¦ÂÂÃ¦ÂÂÃ¥ÂÂÃ¥Â®Â¹Ã¯Â¼ÂÃ¥ÂÂÃ¦ÂÂ°Ã¤Â¸ÂºÃ§Â¬Â¬Ã¤Â¸ÂÃ¦Â­Â¥Ã¥ÂÂÃ¥Â»ÂºÃ§ÂÂFileÃ¥Â¯Â¹Ã¨Â±Â¡
     **/
    public static void getAllFile(File f){
        /*Ã¨ÂÂ·Ã¥ÂÂFileÃ§ÂÂ®Ã¥Â½ÂÃ¤Â¸ÂÃ§ÂÂFileÃ¦ÂÂ°Ã§Â»Â*/
        File[] files = f.listFiles();
        /*Ã©ÂÂÃ¥ÂÂfilesÃ¥Â¾ÂÃ¥ÂÂ°Ã¦Â¯ÂÃ¤Â¸ÂÃ¤Â¸ÂªFileÃ¥Â¯Â¹Ã¨Â±Â¡*/
        if(files!=null){

            for (File file : files) {
                /*Ã¥ÂÂ¤Ã¦ÂÂ­Ã¨Â¯Â¥FileÃ¥Â¯Â¹Ã¨Â±Â¡Ã¦ÂÂ¯Ã¤Â¸ÂÃ¦ÂÂ¯Ã§ÂÂ®Ã¥Â½Â*/
                if(file.isDirectory()){
                    /*Ã¨Â°ÂÃ§ÂÂ¨Ã©ÂÂÃ¥Â½Â*/
                    getAllFile(file);
                }else{
                    /*Ã¨Â¾ÂÃ¥ÂÂºÃ¨Â¯Â¥Ã§ÂÂ®Ã¥Â½ÂÃ¤Â¸ÂÃ¦ÂÂÃ¤Â»Â¶Ã§ÂÂÃ§ÂÂÃ¨Â·Â¯Ã¥Â¾Â*/
                    System.out.println(file.getAbsolutePath());
                }
            }
        }

    }
}
