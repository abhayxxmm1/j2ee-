package project;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/logins")
public class LoginServlet extends HttpServlet {

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
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=req.getParameter("un");
		String pass=req.getParameter("passw");
		PrintWriter p=resp.getWriter();
		p.print("<script>alert('Invalid Credentials')<script>");
		try {
			Statement s=c.createStatement();
			ResultSet r=s.executeQuery("select * from register");
			while(r.next())
			{
				if(name.equals(r.getString(2)) && pass.equals(r.getString(3)));
				{	
					//PrintWriter //p11=resp.getWriter();
					//p11.print("<script>alert('Invalid Credentials')<script>");
					RequestDispatcher rd=req.getRequestDispatcher("Home.html");
					rd.forward(req, resp);
				}
			}
			
			
			
		} catch (SQLException e) {
				e.printStackTrace();
		}
		
	}
}
