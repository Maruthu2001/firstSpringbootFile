package com.example.utils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mysql.cj.jdbc.MysqlDataSource;

public class JDBCUtils {

	public static Statement st = null;
	
	public static Connection cc = null;
	
	public static DataSource getMySQLDataSource() {
		MysqlDataSource mysqlDS = null;
		try {
			mysqlDS = new MysqlDataSource();
			mysqlDS.setURL("jdbc:mysql://localhost:3306/test");
			mysqlDS.setUser("root");
			mysqlDS.setPassword("Maruthu2001");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mysqlDS;
	}
	
	public static Statement getStatement() throws SQLException {
		DataSource ds = getMySQLDataSource();
		try {
			cc = ds.getConnection();
			st = cc.createStatement();
			return st;
		} catch (SQLException e) {
			cc.close();
			e.printStackTrace();
		}
		return st;
	}
	
	public static void closeConnection() {
		try {
			cc.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
