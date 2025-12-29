package UsingMehods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TrainnerCrudOpeartion implements MehodSpecifier {

	
	private static String URL="jdbc:postgresql://localhost:5432/jspiders";
	private static String username="postgres";
	private static String password="root";
	private static Connection c; 
	static Scanner sc=new Scanner(System.in);
	static {
	
		try {
			Class.forName("org.postgresql.Driver");
			c=DriverManager.getConnection(URL,username,password);
		} catch ( SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		TrainnerCrudOpeartion t=new TrainnerCrudOpeartion();
		try {
			boolean b=true;
			while (b) {
				System.out.println("1.insert 2.update 3.delete 4.fetch 5.fetchBy ID");
				int choice=sc.nextInt();
				switch (choice) {
				case 1:t.insert();
					break;
				case 2:t.update();
						break;
				case 3: t.delete();
						break;
				case 4: t.fetch();
						break;
				case 5: t.fetchById();
						break;
				default:
					System.out.println("Wrong Choice!!!!!!!!");
					break;
				}
				System.out.println("Want to Continue?: True or false");
				b=sc.nextBoolean();
			}
			
			c.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void insert()throws Exception {
		
			PreparedStatement p=c.prepareStatement("insert into trainner values(?,?,?)");
			System.out.println("Enter a Details:ID,Name,Subject");
			p.setInt(1, sc.nextInt());
			p.setString(2, sc.next());
			p.setString(3, sc.next());
	
			p.execute();
			System.out.println("Data is insertedd.............");
		
	}

	@Override
	public void update()throws Exception {
			
			PreparedStatement p=c.prepareStatement("update trainner set subject=? where id=?");
			System.out.println("Enter a Details:Subject,id: ");
			p.setString(1, sc.next());
			p.setInt(2, sc.nextInt());
	
			p.execute();
			System.out.println("Data is Updated.............");
		
	}

	@Override
	public void delete()throws Exception {
		
			PreparedStatement p=c.prepareStatement("delete from trainner where id=?");
			System.out.println("Enter a Details:id: ");
			p.setInt(1, sc.nextInt());
			p.execute();
			System.out.println("Data is Deleted.............");
		
	}

	@Override
	public void fetch()throws Exception {
	
			Statement s=c.createStatement();
			ResultSet r=s.executeQuery("select * from trainner");
			while (r.next()) {
				System.out.println("ID: "+r.getInt(1)+" Name: "+r.getString(2)+" Subject: "+r.getString(3));
			}
		
		
	}

	@Override
	public void fetchById()throws Exception {
		
		
			Statement s = c.createStatement();
			ResultSet r=s.executeQuery("select * from trainner where id=2");
			while (r.next()) {
				System.out.println("ID: "+r.getInt(1)+" Name: "+r.getString(2)+" Subject: "+r.getString(3));
			}
		
		
	}
	
	
	
}
