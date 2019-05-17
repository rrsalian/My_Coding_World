package controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Model;



/**
 * Servlet implementation class Balance
 */
@WebServlet("/Balance")
public class Balance extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response) {
		String acno=null;
		String balance=null;
		HttpSession s=request.getSession();
		acno=(String)s.getAttribute("acno");
		
		Model m=new Model();
		m.setAcNo(acno);
	 try {
		boolean temp=m.checkBalance();
		if(temp==true) {
		balance=m.getBalance();
		s=request.getSession();
		s.setAttribute("balance", balance);
		response.sendRedirect("Balance.jsp");
		}
		else {
			response.sendRedirect("Balancefailure.jsp");
		}
	 }
	 catch(Exception e){
		 System.out.println("Check balance error");
	 }
		
		
	
	}

}