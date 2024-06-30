package data;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class control
 */
@WebServlet("/control")
public class control extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		PrintWriter pw=res.getWriter();
		int n=Integer.parseInt(req.getParameter("f1"));
		
		
		
		boolean c=Model.palindrome(n);
		int a=1;
		int b=2;
		if(c) {
		HttpSession hs=req.getSession();
		hs.setAttribute("AAA", a);
		}
		else {
			HttpSession hs=req.getSession();
			hs.setAttribute("AAA", b);
		}
		RequestDispatcher rd=req.getRequestDispatcher("validate.jsp");
		rd.forward(req, res);
		
	}

	

	

}
