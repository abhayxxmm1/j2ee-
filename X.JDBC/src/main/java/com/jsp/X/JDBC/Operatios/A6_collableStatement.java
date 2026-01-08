package com.jsp.X.JDBC.Operatios;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class A6_collableStatement {

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
			
			/**
			 * @StoredProcedure is a predefined set of query which is created in DataBase to perform specific task
			 * 2.every @StoredProcedure will have its own name
			 * 
			 * @CallableStatement is an <I> present in .SQL package
			 * 2.CallableStatement is present in connection<I> object reference
			 * 3.uT call storedProcedur
			 * 4.prepareCall() is uT create implementation object of CallableStatement
			 * 5.prepareCall() will take SQL Query to Call StoredProcedure
			 */
/**3 */		CallableStatement cs=conntd.prepareCall("call stud_insert(7,'MSD')");


/* 4 */		cs.execute();
			System.out.println("Insered.........!!!");
			
			
/* 5 */		conntd.close();
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
