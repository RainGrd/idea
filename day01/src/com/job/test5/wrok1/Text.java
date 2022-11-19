package com.job.test5.wrok1;

import java.util.jar.Pack200;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/30 16:47:13
 * @description: 主方法
 * @version: 1.0
 * @param：
 */
public class Text {
    /*定义正则表达式*/
    Pattern pattern=null;
    Matcher matcher=null;
    /*定义框架*/
    private StringBuffer text;
    /**
     *方法作用：初始化数据
     */
    public Text(String text) {
        this.text = new StringBuffer(text);
    }
    /**
     *方法作用：统计单词个数
     */
    public int countWords() {
        pattern = Pattern.compile(".*[a-zA-Z]+.*");
        int index=0;
        for (int i = 0; i < text.length(); i++) {
            matcher=pattern.matcher(String.valueOf(text.charAt(i)));
            if (matcher.matches()) {
                index++;
            }
        }

        return index;
    }
    /**
     *方法作用：从fromIndex位置开始查找第一次出现str字符串的位置
     */
    StringBuilder newStr=new StringBuilder("");
    public int find(String str,int fromIndex){
        if (fromIndex<0 || fromIndex >= text.length()) {
            System.out.println("索引错误！");
            /*停止程序运行！*/
            System.exit(1);
        }
        int index=0;
        for (int j = fromIndex; j < text.length(); j++) {
            newStr.append(text);
            if (newStr.indexOf(str)!=-1){
                index=j-str.length()+1;
            }
        }
        return index;
    }
    /**
     *方法作用：将文本中所有old字符串的内容替换为newStr
     */
    public void replaceAll(String old,String newStr){
        pattern=Pattern.compile(old);
        matcher=pattern.matcher(text);
        System.out.println("替换后的字符"+matcher.replaceAll(newStr));
    }

}
