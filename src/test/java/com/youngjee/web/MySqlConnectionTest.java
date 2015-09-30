package com.youngjee.web;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MySqlConnectionTest {
	
	private static final String DRIVER="com.mysql.jdbc.Driver";
	private static final String URL="jdbc:mysql://127.0.0.1/book_ex";
	private static final String user="test";
	private static final String pw="test";

	@Test
	public void test() throws ClassNotFoundException {
		Class.forName(DRIVER);
		
		try(Connection conn = DriverManager.getConnection(URL,user,pw)) {
			System.out.println(conn.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
