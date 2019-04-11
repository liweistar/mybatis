package com.itheima.test;

import org.junit.Test;

import java.sql.*;

public class test1 { //创建 HandleSql 类

    static Connection con; //声明 Connection 对象
    static PreparedStatement pStmt;//声明预处理 PreparedStatement 对象
    static ResultSet res;//声明结果 ResultSet 对象

    static String url = "jdbc:mysql://localhost:3306/mybatis?useUnicode=true&characterEncoding=UTF-8&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    static String user = "root";
    static String password = "123456";

    public Connection getConnection() {//建立返回值为 Connection 的方法

        //代码块（1）：加载数据库驱动类
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("数据库驱动加载成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //代码块（2）：通过访问数据库的URL获取数据库连接对象
        try {
            con = DriverManager.getConnection(url,user,password);
            System.out.println("数据库连接成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return con;
    }
    public static void main(String[] args) {//主方法
        test1 h = new test1();//创建本类对象
        con = h.getConnection();//与数据库建立连接

    }
    @Test
    public void test(){
        int a=1;

    }

}
