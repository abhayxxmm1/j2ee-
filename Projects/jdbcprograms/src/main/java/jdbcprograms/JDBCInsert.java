package jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCInsert {

	
	public static void main(String[] args) {
		boolean b=false;
		try {
			
			Class.forName("org.postgresql.Driver");
			Connection c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/QSP","postgres","root");
			Statement s=c.createStatement();
			for (int i = 0; i < 100; i++) {
				b=s.execute("insert into student values(11,'Amit')");
			}
			
			System.out.println(b);
			c.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}
}
