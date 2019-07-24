package Controller;

import Model.Record;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String name=request.getParameter("name");
		String email=request.getParameter("mail");
		String phone=request.getParameter("phone");
		String pass=request.getParameter("pass");
		
		System.out.println("hi");
		Record rd=new Record();
		System.out.println("hi");
		try {
		boolean b =rd.register(name, email, phone, pass) ;
		if (b==false) {
			request.setAttribute("f","false");
			RequestDispatcher rds=request.getRequestDispatcher("Registration.jsp");
			rds.forward(request, response);
		}
		else {
		response.sendRedirect("Login.jsp");
		}
		
		}
		catch(Exception e) {
			System.out.println("Exception ocuur");
		}
	
		
		
	
	}

	
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
//	}

}
