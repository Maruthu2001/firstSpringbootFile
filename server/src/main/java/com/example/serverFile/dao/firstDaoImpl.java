package com.example.serverFile.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.example.utils.JDBCUtils;

public class firstDaoImpl implements firstDao{
	
	public Map<String,Object> getData(String tableName){
		Map<String,Object> returnMap = new HashMap<>();
//		ResultSet rc = null;
		try {
//			Statement smt  = JDBCUtils.getStatement();
//			rc = smt.executeQuery("select PersonID,LastName,FirstName from "+tableName);
//			while(rc.next())
			DataSource ds = JDBCUtils.getMySQLDataSource();
			NamedParameterJdbcTemplate named = new NamedParameterJdbcTemplate(ds);
			String sql = "SELECT * FROM persons";
			 Map<String, Object> params = Collections.singletonMap("name", "dinesh");

		     List<Map<String,Object>> demoList = named.queryForList(sql, params);
		     returnMap.put("status", true);
		     returnMap.put("data", demoList);
		     return returnMap;
//			System.out.print(rc.getInt("PersonID")+" " +rc.getString("LastName")+" " +rc.getString("FirstName"));
//			JDBCUtils.closeConnection();
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return new HashMap<>();
	}

}
