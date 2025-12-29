package productjdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Product implements Requirements {
	
	Connection c;
	
	static Scanner sc=new Scanner(System.in);
	
	
	{
		try {
				Class.forName("org.postgresql.Driver");
				c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/QSP","postgres","root");
		} catch (Exception e) {
			e.printStackTrace();			
			}
	}
	
	public static void main(String[] args) {
		Product p=new Product();
		try {
			boolean b=true;
			while (b) {
				System.out.println("Enter a Choice in Nos: 1.Insert 2.Update 3.Delete 4.Fetch By Id  5.Fetch By Price  6.Fetch All ");
				int choice=sc.nextInt();
				switch (choice) {
				case 1:
					p.insertProduct();
					break;
				case 2: 
					p.updateProductPrice();
					break;
				case 3:
					p.deletePrice();
				case 4:
					p.fetchById();
					break;
				case 5:
					p.fetchByPrice();
					break;
				case 6:
					p.fetchAll();
					break;
				default:
					System.out.println("Enter a Valid Choice");
					break;
				}
				System.out.println("Enter 1 For Contiue and 2 for Exit");
				int ch=sc.nextInt();
				if (ch==2) {
					break;
				}
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	

	@Override
	public void insertProduct() throws Exception {
		System.out.println("Enter a Id,Name,Price For Insertion: ");
		int i1=sc.nextInt();
		String i2=sc.next();
		double i3=sc.nextDouble();
		CallableStatement cs=c.prepareCall("call insert_product(?,?,?)");
		cs.setInt(1, i1);
		cs.setString(2, i2);
		cs.setDouble(3, i3);
		cs.execute();
		System.out.println("Data is insertedd.......");
	}

	@Override
	public void updateProductPrice() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Enter a Id,Price For Updation: ");
		int i1=sc.nextInt();
		double i2=sc.nextDouble();		
		PreparedStatement s=c.prepareStatement("update product set price=? where id=?");
		s.setDouble(1, i2);
		s.setInt(2,i1);
		s.execute();
		System.out.println("Data is Updated...........");
	
		
	}

	@Override
	public void deletePrice() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Enter a Price For Deletion: ");
		double i2=sc.nextDouble();		
		PreparedStatement s=c.prepareStatement("delete from product where price=?");
		s.setDouble(1, i2);
		s.execute();
		System.out.println("Data is Deletedd...........");
		
	}

	@Override
	public void fetchById() throws Exception {
		// TODO Auto-generated method stub
		
		Statement s=c.createStatement();
		System.out.println("Enter a Id fro the Fetching........: ");
		int id=sc.nextInt();
		String query="select * from product where id="+id;
		ResultSet rs=s.executeQuery(query);
		while (rs.next()) {
			System.out.println("Id:"+rs.getInt(1)+" Name:"+rs.getString(2)+" Price:"+rs.getDouble(3));
		}
		
		
	}

	@Override
	public void fetchByPrice() throws Exception {
		// TODO Auto-generated method stub
		
		Statement s=c.createStatement();
		System.out.println("Enter a Price fro the Fetching........: ");
		double id=sc.nextDouble();
		String query="select * from product where price="+id;
		ResultSet rs=s.executeQuery(query);
		while (rs.next()) {
			System.out.println("Id: "+rs.getInt(1)+" Name:"+rs.getString(2)+" Price:"+rs.getDouble(3));
		}
		
	}

	@Override
	public void fetchAll() throws Exception {
		// TODO Auto-generated method stub
		
		Statement s=c.createStatement();
		String query="select * from product";
		ResultSet rs=s.executeQuery(query);
		while (rs.next()) {
			System.out.println("Id: "+rs.getInt(1)+" Name: "+rs.getString(2)+" Price: "+rs.getDouble(3));
		}
		
	}

}
