package com.jsp.X.JDBC.Operatios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class A5_prepareStatement {

	public static void main(String[] args) {
		try {
			
			Scanner sc=new Scanner(System.in);
			
/* 1 */		Class.forName("org.postgresql.Driver");
/* 2 */		Connection conntd=DriverManager.getConnection("jdbc:postgresql://localhost:5432/scott","postgres","root");
			
			/**
			 * 1.PreparedStatement is an <I> present in .SQL package
			 * 2.PreparedStatement is present in connection<I> object reference
			 * 3.uT execute Dynamic Query
			 * 4.prepareStatement(null) is uT create implementation
			 * object of PreparedStatement<I>
			 * 
			 * @param 5.?(place holder, delimiter) uT hold data which is passed during execution
			 * 6.PreparedStatement<I> is an sub<I> of Statement<I>
			 * 
			 */
/**3 */		PreparedStatement ps= conntd.prepareStatement("insert into student values(?, ?, ?)");
//			PreparedStatement ps= conntd.prepareStatement("insert into student values(?1, ?2, ?3)");
//			---------------------------------------------------------------------------^---^---^ this doesn't works here
//			ps.setInt(1, 17);
//			ps.setString(2, "MiniPavan");
//			ps.setDouble(3, 5432.0);
			
			PreparedStatement ps2= conntd.prepareStatement("delete from student where id=?");
			System.out.print("Enter the id to be deleted = ");
			ps2.setInt(1, sc.nextInt());
			/**
			 * setX(int position of delimiter, data)
			 * 1.is a non-static() present in PreparedStatement<I> obj reference
			 * 2.uT pass data too place Holder
			 * 3.delimiter position starts from 1 
			 * 4.X indicates dataType of Passing value
			 * 
			 * @exception SQLException
			 */
///**4 */		ps.execute(); //.boolean
/**4 */		ps2.executeUpdate(); //.boolean
//			ps.executeUpdate(); //.integer and during updating values 
			System.out.println(ps2.execute());
			System.out.println(ps2.executeUpdate());
			
			
			
/* 5 */		conntd.close();
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
