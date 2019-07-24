package com.rrs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MulServlet extends HttpServlet {
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		
		//Redirect URL Rewriting
//		
//		int a=Integer.parseInt(req.getParameter("k"));
		PrintWriter out=res.getWriter();
//		out.println(a);
//		
		
		
	//Session Redirect
//			HttpSession ses=req.getSession();
//			int a=(int) ses.getAttribute("k");
//			out.println(a);
		
	//Cookies Redirect
		
		int k;
		Cookie cks[]=req.getCookies();
		for(Cookie c:cks) {
			if(c.getName().equals("k")) {
				out.println("Mul=");
				out.print(Integer.parseInt(c.getValue()));
			}
		}
				
		
	}

}
