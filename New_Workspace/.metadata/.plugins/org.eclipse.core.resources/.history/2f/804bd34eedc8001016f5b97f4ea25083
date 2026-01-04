package com.qsp.ContextConfig;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/context")
public class Context extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ServletContext context = getServletContext();
		String user = context.getInitParameter("user");
		String pass= context.getInitParameter("pass");
		
		PrintWriter pw =  resp.getWriter();
		pw.print("<h1>"+user+"</h1>");
		pw.print("<h1>"+pass+"</h1>");
	}
}
