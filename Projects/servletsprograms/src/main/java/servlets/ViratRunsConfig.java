package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ViratRunsConfig extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletConfig s=getServletConfig();
		String odicent=s.getInitParameter("ODI");
		PrintWriter pw=resp.getWriter();
		pw.print("<h1>Top ODI Centuries:  "+odicent+"</h1>");
		
		// TODO Auto-generated method stub
	//	super.doGet(req, resp);
	}

}
