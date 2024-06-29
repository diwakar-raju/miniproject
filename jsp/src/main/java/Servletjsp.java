

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servletjsp
 */
@WebServlet("/Servletjsp")
public class Servletjsp extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res)
	{
		int id=Integer.parseInt(req.getParameter("f1"));
		String st=req.getParameter("f2");
		try {
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/diwa","root","root");
			String str="select*from s_details where id=?;";
			PreparedStatement ps=cn.prepareStatement(str);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				int a=rs.getInt(1);
				String s=rs.getString(2);
				int marks=rs.getInt(3);
				if(a==id&&s.equals(st))
				{
					int b=marks;
					
					HttpSession hs=req.getSession();
					hs.setAttribute("AAA", b);
					HttpSession hs1=req.getSession();
					hs1.setAttribute("BBB", st);
					RequestDispatcher rd=req.getRequestDispatcher("jspDemo.jsp");
					try {
						rd.include(req, res);
					} catch (ServletException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
