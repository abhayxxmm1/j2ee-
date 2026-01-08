package com.jsp.X.JDBC.Operatios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class A1_execute {

	public static void main(String[] args) {
		try {
			/**
			 * @static Class.forName()
			 * @exception ClassNotFoundException
			 */
/* 1 */		Class.forName("org.postgresql.Driver");
			/**
			 * // driver registers itself with DriverManager [web:25][web:36]
			 * @static DriverManager.getConnection()
			 * @exception SQLException
			 */
/* 2 */		Connection conntd=DriverManager.getConnection("jdbc:postgresql://localhost:5432/scott","postgres","root");
			
/* 3 */		Statement stm= conntd.createStatement();

			/**
			 * execute will perform all types of queries
			 * non-static() present in Statement<I> object reference
			 * 
			 * @returns true if we perform DQL(SELECT) Query
			 * @returns false if we perform DML, DDL(NON-SELECT) Query
			 * 
			 * @exception SQLException
			 */
/* 4 */		boolean bool=stm.execute("insert into student values(101,'sandeep',1234.0)");
			System.out.println(bool);
			
			
/* 5 */		conntd.close();
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
