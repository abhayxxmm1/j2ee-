package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



public class MyServlet extends HttpServlet {

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			
			String name=req.getParameter("names");
			String pass=req.getParameter("pass");
			
			PrintWriter p=resp.getWriter();
			p.print("<h1>Name is: </h1>"+name);
			p.print("<h1>Password is: </h1>"+pass);
			//super.doGet(req, resp);
		}
		
}
