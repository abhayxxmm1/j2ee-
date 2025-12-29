package com.qsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet{
 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { // add this your-self
		
		String name = req.getParameter("username");
		String phone = req.getParameter("password");
//		String email = req.getParameter("e");
		
		
		PrintWriter pw = resp.getWriter();
		pw.print("<h1>Name : " + name + "</h1>");
		pw.print("<h1>Phone No. : " + phone + "</h1>");
		
		
//		pw.print("<h1>Email Id : " + email + "</h1>");

	}
}
