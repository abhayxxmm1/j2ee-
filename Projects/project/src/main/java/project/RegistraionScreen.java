package project;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegistraionScreen extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String pass=req.getParameter("password");
		String cpass=req.getParameter("cpass");
		
		PrintWriter pw=resp.getWriter();
		
		DataStore d=new DataStore();
		d.store(name, email, cpass);
		
		pw.print("<script>alert('Registerd Successfully.....!')</script>");
		pw.print("<h1>Welcome..</h1>");
	}
}
