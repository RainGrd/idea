package com.wrap.test1;

import java.util.Scanner;
import java.util.Vector;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/22 9:58:10
 * @description 主方法
 */
public class ScoreTest {
    public static void main(String[] args) {

        //1.实例化Scanner对象
        Scanner input=new Scanner(System.in);
        //2.创建Vector对象
        Vector v = new Vector();
        //最大值
        int max=0;
        //3.通过for(;;)循环给Vector中添加数据
        for (;;) {
            System.out.println("请输入学生成绩<以负数代表输入结束>：");
            int score=input.nextInt();
            //3.2 当输入是负数是，跳出循环
            if (score <= 0) {
                //
                break;
            }else if (score >=100) {
                System.out.println("你输入的数据非法，请重新输入：");
                continue;
            }
            //3.1 添加数据
            //在jdk 5.0之前采用以下方式
            /*Integer inScore=new Integer(score);
            v.addElement(inScore);*/

            //自动装箱
            v.addElement(score);
            //4. 获取最大值
            if (max <score) {
                max=score;
            }
        }
        //5.遍历Vector,等到每个学生的成绩，并与最大值比较，得到每个学生的等级
        char level;
        for(int i=0; i<v.size(); i++){
            //取得每一个v的数据，而v是一个对象，得用Object类来赋值
            Object obj=v.elementAt(i);
            /*
            在jdk 5.0之前采用以下方式
            * Integer inScore=(Integer)obj;
            * int score= inScore.intValue();
            */
            //jdk 5.0之后的方式了
            int score=(int)obj;
            //自动拆箱
            if (max-score<=10) {
                level='A';
            }else if (max - score <= 20) {
                level='B';
            }else if (max - score <= 30) {
                level='C';
            }else{
                level = 'D';
            }
            System.out.println("student-"+i+" score is "+score+" level is "+level);
        }
    }

}
