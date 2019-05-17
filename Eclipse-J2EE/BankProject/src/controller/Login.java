package controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Model;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
  
	
	public void service(HttpServletRequest request,HttpServletResponse response) {
		String custid=request.getParameter("custid");
		String psw=request.getParameter("psw");
		Model m=new Model();
		m.setCustid(custid);
		m.setPsw(psw);
		
		boolean temp=m.login();
		try {
		if(temp==true) {
			String acno=m.getAcNo();
			HttpSession s=request.getSession(true);
			s.setAttribute("acno", acno);
			response.sendRedirect("LoginSuccess.jsp");	
		}
		else {
			response.sendRedirect("LoginFailure.html");
		}
		}
		catch(Exception e) {
			System.out.println("Invalid ");
		}
	}

}
