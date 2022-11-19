package com.bdqn.demo1;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class StudentDAOImpl implements IStudentDAO{
    /*SQL语句*/
    String sql;
    @Override
    public boolean add(Student s) {
        /*?是占位符*/
        sql="insert into t_student(name,age,sex) values(?,?,?)";
        return Util.executeUpdate(sql,s.getName(),s.getAge(),s.getSex());
    }

    @Override
    public boolean delete(int id) {
        sql="delete from t_student where id=?";
        return Util.executeUpdate(sql,id);
    }

    @Override
    public boolean update(Student s) {
        /*根据Id修改学生*/
        sql="update t_student set name=?,age=?,sex=? where id=?";
        return Util.executeUpdate(sql,s.getName(),s.getAge(),s.getSex(),s.getId());
    }

    @Override
    public void query() {
        sql="select * from t_student";
        /*条件查询*/
        List<Map<String, Object>> lists = Util.executeQuery(sql);
        /*使用迭代器遍历*/
        Iterator<Map<String, Object>> it=lists.iterator();
       /* while(it.hasNext()){
            遍历结果集
            System.out.println(it.next());
        }*/
        /*格式化数据*/
        String str="";
        for (Map<String, Object> list : lists) {
            if(list.get("sex").equals(1)){
                str="男";
            }else {
                str="女";
            }
            System.out.println("学号："+list.get("id")+"\t姓名："+list.get("name")+"\t年龄："+list.get("age")+"\t性别:"+str);
        }
        if(lists.size() <=0){
            System.out.println("没有学生的数据！请添加学生：");

        }
        /**/
    }

}
