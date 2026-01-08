package com.jsp.X.JDBC.Operatios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class A2_executeUpdate {

	public static void main(String[] args) {
		try {
			
/* 1 */		Class.forName("org.postgresql.Driver");
/* 2 */		Connection conntd=DriverManager.getConnection("jdbc:postgresql://localhost:5432/scott","postgres","root");
			
/* 3 */		Statement stm= conntd.createStatement();
			
			/**
			 * executeUpdate is a specialized() and it will perform DML(INSERT, UPDATE, DELETE) queries
			 * non-static() present in Statement<I> object reference
			 * 
			 * returns number of rows affected by DML(INSERT, UPDATE, DELETE) queries
			 * 
			 * will throw SQLException
			 */
/**4 */		int inte=stm.executeUpdate("INSERT INTO student (id, name, sal) VALUES " +
			    "(12, 'amit', 123.0)," +
			    "(13, 'chinmay', 123.0)," +
			    "(14, 'omkar', 123.0)," +
			    "(15, 'abhijeet', 123.0)");
			System.out.println(inte);
			
			
			
/* 5 */		conntd.close();
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
