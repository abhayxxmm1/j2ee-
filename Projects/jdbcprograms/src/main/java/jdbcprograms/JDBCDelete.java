package jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDelete {

	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			Connection c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/QSP","postgres","root");
			Statement s=c.createStatement();
			boolean b=s.execute("delete from student where id=11");
			System.out.println(b);
			c.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
