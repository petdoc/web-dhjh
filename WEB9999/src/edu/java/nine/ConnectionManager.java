package edu.java.nine;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 * Servlet implementation class ConnectionManager
 */

public class ConnectionManager {

	private ConnectionManager() {} // private 생성자
	
	public static Connection getConnection() {
		Connection conn = null;
		try {
			// JNDI(Java Naming and Directory Interface)
			
			// InitialContext 객체 생성
			Context initContext = new InitialContext();
			
			// server.xml에 설정한 jdbc/myoracle 또는 jdbc/mysql 리소스(DataSource 객체) 정보를 찾음
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource)envContext.lookup("jdbc/mysql");
			
			// DataSource 객체를 사용해서 Connection 객체 생성
			conn = ds.getConnection();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	} // end getConnection()

	public static void close(Connection conn, Statement stmt) {
		try {
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
			close(conn, stmt);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} // end close()

} // end class ConnMgr

