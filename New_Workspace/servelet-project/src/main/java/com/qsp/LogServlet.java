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

@WebServlet("/login")
public class LogServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	

		String user=req.getParameter("username");
		String pass=req.getParameter("password");
		
		
		JDBCLogic jdbc = new JDBCLogic();
		boolean res = jdbc.login(user, pass);
		
		if (res) {
			RequestDispatcher rd = req.getRequestDispatcher("home.html");
			rd.forward(req, resp);
		}else {
			
			PrintWriter pw = resp.getWriter();
			pw.print("<h1>Wrong credentials</h1>");
			RequestDispatcher rd = req.getRequestDispatcher("login.html");
			rd.include(req, resp);
		}
		
		
	}
}