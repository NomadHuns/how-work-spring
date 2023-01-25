package web2.config;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * http:/localhost:8080/
 */
@WebServlet("*.do")
public class FrontController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		MyProcess.init();
		System.out.println(req.getRequestURI());
		String path = req.getRequestURI();
		
		switch (path) {
		case "/a.do":
			resp.sendRedirect("a.jsp");
			break;
		case "/b.do":
			resp.sendRedirect("b.jsp");
			break;
		case "/c.do":
			resp.sendRedirect("c.jsp");
			break;
		case "/d.do":
			resp.sendRedirect("d.jsp");
			break;
		case "/home.do":
		default:
			req.setAttribute("name", "홍길동");
//			resp.sendRedirect("home.jsp");
			req.getRequestDispatcher("home.jsp").forward(req, resp);
			break;
		}
	}
}
