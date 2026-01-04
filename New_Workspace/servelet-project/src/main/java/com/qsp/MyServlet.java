package com.qsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class MyServlet extends GenericServlet{



	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter pWriter =res.getWriter();
		pWriter.print("<h1>Byeeeeeeee</h1>");
	}

}
