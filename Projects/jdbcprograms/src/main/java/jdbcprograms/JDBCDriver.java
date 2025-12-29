package jdbcprograms;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCDriver {
	
	static final String QUERY = "SELECT * from student ";

	public static void main(String[] args) {
		
		try {
			
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver is Loaded!!!!!!");
			Connection c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/QSP","postgres", "root");
			System.out.println(c);
		
			 java.sql.Statement stmt = c.createStatement();
	         ResultSet rs = stmt.executeQuery(QUERY); {
	         // Extract data from result set
	         while (rs.next()) {
	            // Retrieve by column name
	            System.out.print("ID: " + rs.getInt("id"));
	            System.out.println(", name: " + rs.getString("name"));
	            
	         }
	        }
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		
	}
}
