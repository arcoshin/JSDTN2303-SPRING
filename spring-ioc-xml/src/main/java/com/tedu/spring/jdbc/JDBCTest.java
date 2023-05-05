package com.tedu.spring.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 測試連接數據庫是否成功
 */
public class JDBCTest {
    //1.原生Druid連接數據庫
    @Test
    public void demo01() throws SQLException {
        DruidDataSource ds = new DruidDataSource();
        ds = new DruidDataSource();
        ds.setUsername("root");
        ds.setPassword("root");
        ds.setUrl("jdbc:mysql://localhost:3306/birdbootdb?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Taipei&rewriteBatchedStatements=true");
        ds.setMaxActive(30);//與數據庫的同時最大連接數
        ds.setInitialSize(5);//與數據庫的初始連接數

        Connection connection = ds.getConnection();
        String sql = "SELECT * FROM userinfo";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            String nickname = resultSet.getString("nickname");
            int age = resultSet.getInt("age");
            System.out.println(username + "," + password + "," + nickname + "," + age);
        }
    }

    //2.外部屬性注入
    @Test
    public void demo02() throws SQLException {
        ClassPathXmlApplicationContext CPXAC = new ClassPathXmlApplicationContext("bean-jdbc.xml");
        DruidDataSource ds2 = CPXAC.getBean("ds2", DruidDataSource.class);
        Connection c2 = ds2.getConnection();

        String sql = "SELECT * FROM userinfo";
        Statement s2 = c2.createStatement();
        ResultSet rs = s2.executeQuery(sql);
        while (rs.next()) {
            String username = rs.getString("username");
            String password = rs.getString("password");
            String nickname = rs.getString("nickname");
            int age = rs.getInt("age");
            System.out.println(username + "," + password + "," + nickname + "," + age);
        }

    }
}
