package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataStore {
	
	private static Connection c;
	
	static
	{
		try {
			Class.forName("org.postgresql.Driver");
			c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/jspiders","postgres","root");
		} catch (SQLException  | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void store(String ename,String email,String pass) {
		try {
			PreparedStatement ps=c.prepareStatement("insert into register values(?,?,?)");
			ps.setString(1, ename);
			ps.setString(2, email);
			ps.setString(3, pass);
			
			ps.execute();
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
