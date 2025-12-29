package requstdispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String ename=req.getParameter("un");
		String pass=req.getParameter("pass");
		
		if (ename.equals("XYZ") && pass.equals("123")) {
			RequestDispatcher rd=req.getRequestDispatcher("Home.html");
			rd.forward(req, resp);
		} else {
			PrintWriter p=resp.getWriter();
			p.print("<h1>Wrong Credentials</h1>");
			RequestDispatcher rs=req.getRequestDispatcher("Login.html");
			rs.include(req, resp);
		}
		
	//	super.doGet(req, resp);
	}
}
