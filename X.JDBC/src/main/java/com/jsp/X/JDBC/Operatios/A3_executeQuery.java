package com.jsp.X.JDBC.Operatios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.management.Query;

public class A3_executeQuery {

	private static final String QUERY = "SELECT * from student";

	public static void main(String[] args) {
		try {
			
/* 1 */		Class.forName("org.postgresql.Driver");
/* 2 */		Connection conntd=DriverManager.getConnection("jdbc:postgresql://localhost:5432/scott","postgres","root");
			
/* 3 */		Statement stm= conntd.createStatement();
			
			/**
			 * executeQuery will perform DQL("SELECT * from student") queries
			 * non-static() present in Statement<I> object reference
			 * 
			 * @returns ResultSet<I>
			 * -------1.is an <I> present in .SQL package
			 * -------2.uT fetch data from DataBase(Buffer Memory)
			 * 
			 * executeQuery() & getResultSet() helps to create implementation 
			 * object of ResultSet<I>
			 * ----------------------------	Statement<I>
			 * @helper()'s------------------------------executeQuery()
			 * @helper()'s------------------------------getResultSet() 
			 * ------------------------------------------------------------rs.next()
			 * @returns------------------------------------------------------------ boolean
			 * @paramOverloaded()'s--------------------------------------rs.getX("column Index") index starts from 1
			 * @paramOverloaded()'s--------------------------------------rs.getX("column Name")
			 * --------------------------------------------------------------1.fetches data from particular column & returns data
			 * --------------------------------------------------------------2.X indicates dataType of Column
			 * 
			 * @exception SQLException
			 */
/**4 */		ResultSet rs=stm.executeQuery(QUERY);
			//Extract's data from result set
			while (rs.next()) {
				// Retrieved by column name
	            System.out.print("ID: " + rs.getInt("id"));
	            System.out.print(", name: " + rs.getString("name"));
	            System.out.println(", Salary: " + rs.getString("sal"));
			}
			System.out.println(rs);
			
			
			
/* 5 */		conntd.close();
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
