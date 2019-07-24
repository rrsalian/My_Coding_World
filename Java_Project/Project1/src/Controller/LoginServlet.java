package Controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.Record;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("mail");
		String pass=request.getParameter("pass");
		Record rd=new Record();
		
		try {
			boolean b=rd.check(email, pass);
			System.out.println(b);
			if(b==true) {
				HttpSession ses=request.getSession();
				ses.setAttribute("name", email);
				ses.setAttribute("log", "true");
				
				response.sendRedirect("index.jsp");
			}
			else {
				request.setAttribute("match","false");
				RequestDispatcher rds=request.getRequestDispatcher("Login.jsp");
				rds.forward(request, response);
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
