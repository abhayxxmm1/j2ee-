package calllablestatments;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StoredProcedureCall {

	public static void main(String[] args) {
	
		try {
			
			Class.forName("org.postgresql.Driver");
			Connection c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/QSP","postgres","root");
			CallableStatement cs=c.prepareCall("call stud_insert(7,'MSD')");
			cs.execute();
			System.out.println("Insered.........!!!");
			c.close();
		}catch(SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}
	
	
}
