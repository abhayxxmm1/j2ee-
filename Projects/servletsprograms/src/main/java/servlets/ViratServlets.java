package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ViratServlets extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		ServletContext s=getServletContext();
		
		String t20=s.getInitParameter("T20_Runs");
		PrintWriter p=resp.getWriter();
		
		p.print("<h1>"+t20+"</h1>");
		
		// TODO Auto-generated method stub
	//	super.doGet(req, resp);
	}
}
