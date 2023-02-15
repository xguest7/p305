package team9;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/d")
public class dServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		int count = Integer.parseInt(request.getParameter("count"));		
		
		List<Integer> rnum = new ArrayList<>();		
		
//		for(int i=0;i<count;i++) {
//		int com=(int)(Math.random()*(num2-num1+1)+num1);
//		rnum.add(com);
//	}		
		for(int i=0;i<count;i++) {
			int com=(int)(Math.random()*(num2-num1+1)+num1);
			rnum.add(i,com);
			for(int j=0;j<i;j++) {
				if(rnum.get(i)==rnum.get(j)) {
					rnum.remove(i);
					i--;
				}
			}
		}

		for(int num:rnum) {
			System.out.println(num);
		}
		
		request.setAttribute("rnum", rnum);		
		
		RequestDispatcher dispatch=request.getRequestDispatcher("d.jsp");
		dispatch.forward(request, response);
	}

}
