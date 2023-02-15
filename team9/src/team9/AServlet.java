package team9;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/a")
public class AServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a = request.getParameter("a");
		int count = 0;
		
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == '!') {
				count ++;
			}
		}
		request.setAttribute("count", count);
		RequestDispatcher rd = request.getRequestDispatcher("/a.jsp");
		rd.forward(request, response);
	}

}
