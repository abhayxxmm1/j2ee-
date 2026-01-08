package com.jsp.X.JDBC.Operatios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;

public class A4_addBatch {

	public static void main(String[] args) {
		try {
			
/* 1 */		Class.forName("org.postgresql.Driver");
/* 2 */		Connection conntd=DriverManager.getConnection("jdbc:postgresql://localhost:5432/scott","postgres","root");
			
/* 3 */		Statement stm= conntd.createStatement();
			
			/**
			 * BatchExicution is the process of executing multiple Queries at a time 
			 * addBatch is uT add multiple Queries 
			 * for executing batch we are having executeBatch();
			 * 
			 * @returns int[] indicates no. of rows affected
			 * 
			 * @exception SQLException
			 */
			stm.addBatch("INSERT INTO student (id, name, sal) VALUES " +
			    "(12, 'amit', 123.0)," +
			    "(13, 'chinmay', 123.0)," +
			    "(14, 'omkar', 123.0)," +
			    "(15, 'abhijeet', 123.0)");
			
			stm.addBatch("delete from student where id=12");
			stm.addBatch("update student set name='superman' where id=15");
			
/**4 */		int[] n=stm.executeBatch();
			for (int i : n) {	/// forEach
				System.out.println(i);
			}
			
/* 5 */		conntd.close();
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
