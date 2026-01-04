package com.reg_log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCLogic {

	private static String URL = "jdbc:postgresql://localhost:5432/reg";
	private static String user = "postgres";
	private static String pass = "root";
	private static Connection con;
	
	static {
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(URL,user,pass);

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
	}
	
	
	
	public void save(String name, String email,String password, String cp) {
		try {
			if (password.equals(cp)) {
				
				PreparedStatement ps = con.prepareStatement("insert into users values(?,?,?,?)"); 
				/// don't use user coz its already present in postgres
				
				ps.setString(1, name);
				ps.setString(2, email);
				ps.setString(3, password);
				ps.setString(4, cp);
				
				ps.execute();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public boolean login(String user, String password) {
		try {
			PreparedStatement ps = con.prepareStatement("select * from users where name=? and password=? ");
			ps.setString(1, user);
			ps.setString(2, password);
			
			ResultSet rs=ps.executeQuery();
			
			if (rs.next()) {
				return true;
			}
			
			ps.execute();

			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return false;
	}
	
	
}

