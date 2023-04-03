package com.hibernate.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JbdcTest {
public static void main(String[] args) {
	String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
	String userName = "root";
	String pass="root";
	try {
		Connection myConn = DriverManager.getConnection
				(
						jdbcUrl,userName,pass);
		System.out.println("Connections success");
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
