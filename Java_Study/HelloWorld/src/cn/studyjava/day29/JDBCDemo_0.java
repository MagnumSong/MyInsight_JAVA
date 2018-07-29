package cn.studyjava.day29;

/*
* JDBC操作数据库步骤
* 1.注册驱动
*   告知JVM使用的是哪一个数据库的驱动
* 2.获得链接
*   使用JDBC的类，完成对MySQL数据库的链接
* 3.获得语句执行平台
*   通过连接对象获取对SQL语句的执行者对象
* 4.执行sql语句
*   使用执行者对象，向数据库执行SQL语句
* 5.处理结果
*   获取到数据库执行后的结果
* 6.释放资源
*   调用一堆的close()
* */

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDemo_0 {

    // 定义主方法
    public void JDBCDemo_0_main(String[] args) throws SQLException {
        // 1.注册驱动
        //DriverManager.registerDriver(new Driver());
    }

}
