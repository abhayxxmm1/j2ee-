package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/topruns")
public class TopScorer extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletContext s=getServletContext();
		String topruns=s.getInitParameter("T20_Runs");
		PrintWriter pw=resp.getWriter();
		pw.print("<h1>Top Runs "+topruns+"</h1>");
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
	}
}
