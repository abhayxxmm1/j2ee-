package com.qsp.ContextConfig;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class PandyaServelet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	

		ServletConfig config = getServletConfig();
	 	String wife = config.getInitParameter("wife");
	 	
	 	PrintWriter pw =  resp.getWriter();
	 	pw.print("<h1>"+wife+"<h1>");
	}

}
