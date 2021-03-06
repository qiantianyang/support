package com.yancy.support.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SimpleJdbcQueryTemplate {

	public int query(String queryString,String getInt) {
		Connection connection = null;
		PreparedStatement stmt = null;
		String url = "jdbc:mysql://iapaliyunostrakon.mysql.rds.aliyuncs.com:3306/production" ; 
		String username = "wildfire" ; 
		String password = "AGEm7qUF7QpR"; 
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection(
					url , username , password);
			stmt = connection.prepareStatement(queryString);
			ResultSet rs = stmt.executeQuery();
			return rs.getInt(getInt);
		} catch (Exception e) {
			closeStatement(stmt);
			stmt = null;
			releaseConnection(connection);
			connection = null;
			e.printStackTrace();
			throw new RuntimeException("An sql exception occurred.", e);
		} finally {
			closeStatement(stmt);
			releaseConnection(connection);
		}

	}

	private void releaseConnection(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	private void closeStatement(Statement stmt) {
		if (stmt != null) {
			try {
				stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
