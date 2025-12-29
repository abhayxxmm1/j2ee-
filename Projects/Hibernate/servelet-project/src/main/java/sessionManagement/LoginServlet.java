package sessionManagement;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login1")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String user = req.getParameter("u");
		String pass = req.getParameter("p");
		if (user.equals("XYZ") && pass.equals("123")) {
			HttpSession session = req.getSession();
			session.setAttribute("user", user);
			session.setAttribute("pass", pass);
			session.setMaxInactiveInterval(20);
			RequestDispatcher rd = req.getRequestDispatcher("home");
			rd.forward(req, resp);
		} else {
			PrintWriter pw = resp.getWriter();
			pw.print("<h1>Innvalid credentials</h1>");
			RequestDispatcher rd = req.getRequestDispatcher("login.html");
			rd.include(req, resp);
		}
	}
}
