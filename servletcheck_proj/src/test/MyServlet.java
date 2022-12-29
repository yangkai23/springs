package test;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/test")
class MyServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String user_name=req.getParameter("un");
			PrintWriter out=resp.getWriter();
			out.println("<html><body bgcolor=blue>"
					+ "<h1>Welcome "+user_name+" Login Time "+new Date()+" </h1>"
							+ "</body></html>");
			out.close();
	}
}
