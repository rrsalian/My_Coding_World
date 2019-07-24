package com.rrs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		
		int a=Integer.parseInt(req.getParameter("num1"));
		int b=Integer.parseInt(req.getParameter("num2"));
		
		int k=a+b;
		int c=a*b;
		
// 1.RequestDispatcher
		
		PrintWriter out=res.getWriter();
		out.println("sumsumsum="+k);
		
		req.setAttribute("k",k);
		
		RequestDispatcher rd=req.getRequestDispatcher("sq");
		rd.include(req, res);
		
// 2.SendRedirect
		
		//res.sendRedirect("mul?k="+c);  // URL Rewriting
		
		
		//Session and sendRedirect
		
//		HttpSession ses=req.getSession();
//		ses.setAttribute("k", c);
//		
//		res.sendRedirect("mul");
		
// 3.Cookies 
		
//		Cookie ck=new Cookie("k",c+"");
//		res.addCookie(ck);
//		
//		res.sendRedirect("mul");
//		
		
	}

}
	