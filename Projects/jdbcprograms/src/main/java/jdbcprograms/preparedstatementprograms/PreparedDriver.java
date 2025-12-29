package jdbcprograms.preparedstatementprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedDriver {

	static Connection c;
	
	public static void main(String[] args) {
		
		try {
			
			Class.forName("org.postgresql.Driver");
			c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/QSP","postgres","root");
			PreparedStatement p=c.prepareStatement("insert into student values(?,?)");
			p.setInt(1, 101);
			p.setString(2, "Omkar Mane");
			p.executeUpdate();
			System.out.println("Inserted........");
			update();
			delete();
			fetch();
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static void fetch()
	{
		PreparedStatement p;
		try {
			p = c.prepareStatement("select * from student");
			ResultSet rs=p.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void update() {
		try {
			c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/QSP","postgres","root");
			PreparedStatement p=c.prepareStatement("update student set name=? where id=?");
			p.setInt(2, 101);
			p.setString(1, "Pankaj");
			p.executeUpdate();
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void delete() {
		
		try {
			c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/QSP","postgres","root");
			PreparedStatement p=c.prepareStatement("delete from student where id=?");
			p.setInt(1, 101);
			p.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
