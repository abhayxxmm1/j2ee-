package com.qsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class RegisterServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	

		
		
//		try {
//			Class.forName("org.postgresql.Driver");
//			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/resgister","postgres","root");
//			
//
//			PreparedStatement ps = con.prepareStatement("insert into rup values(?,?)");
//			ps.setString(1, nString);
//			ps.setString(2, pString);
//			
//			// 4th step
//			ps.execute();
//		
//			//5
//			con.close();
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace(); 
//		}

		
		
		
		String nString = req.getParameter("username");
		String pString = req.getParameter("password");
		
		
//		int id2 = Integer.parseInt(user);
//		int phno2 = Integer.parseInt(pass);
//		
		JDBCLogic jdbc = new JDBCLogic();
		jdbc.save(nString, pString);
		
		PrintWriter pw = resp.getWriter();
		pw.print("<h1>UN ="+ pString +"<h1>");
		pw.print("<h1>UN ="+ nString +"<h1>");
		
		
		
		
		
		
		
		
		
		/** 1st one
		 * 
		  
		 if (nString.equals("XYZ") && pString.equals("123")) {
			
			RequestDispatcher rd = req.getRequestDispatcher("home.html");
			rd.forward(req, resp);
			
		}else {
			
			RequestDispatcher rd = req.getRequestDispatcher("reg2.html");
			rd.include(req, resp);
			PrintWriter pd = resp.getWriter();
			pw.print("<h1>Wrong creentials</h1>");
		}
		 */
		

	}
}













