package com.bdqn.demo1;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public interface IStudentDAO {
    /**
     * @param s 学生对象
     * @return boolean
     * @author 段荣贵
     * @description //TODO 肖萧奈何桥
     * @date 20:22:16 2022/4/7
     * 方法描述：添加新学生
     **/
    boolean add(Student s);

    /**
     * @param id 学号
     * @return boolean
     * @author 段荣贵
     * @description //TODO 肖萧奈何桥
     * @date 20:23:00 2022/4/7
     * 方法描述：根据id删除学生
     **/
    boolean delete(int id);

    /**
     * @param s 学生对象
     * @return boolean
     * @author 段荣贵
     * @description //TODO 肖萧奈何桥
     * @date 20:23:42 2022/4/7
     * 方法描述：根据id名修改姓名
     **/
    boolean update(Student s);
    /**
     * @author 段荣贵
     * @description //TODO 肖萧奈何桥
     * @date 20:39:43 2022/4/7
     * @param 
     * @return 
     * 方法描述：查询数据的方法
     **/
    void query();
}
