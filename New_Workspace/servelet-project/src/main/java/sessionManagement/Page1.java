package sessionManagement;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("page2")
public class Page1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);

		if (session != null && session.getAttribute("user") != null) {
			PrintWriter pw = resp.getWriter();
			pw.print("<h1>Home Page</h1>");

		}else {
			PrintWriter pw=resp.getWriter();
			pw.print("<h1>You are already logged out</h1>");
		}
	}

}
