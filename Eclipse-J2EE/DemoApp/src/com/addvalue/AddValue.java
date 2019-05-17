package com.addvalue;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddValue extends HttpServlet{

	public void service(HttpServletRequest x,HttpServletResponse y) {
		int i=Integer.parseInt(x.getParameter("n1"));
		int j=Integer.parseInt(x.getParameter("n2"));
		int k=i+j;
		try {
			PrintWriter out=y.getWriter();
			out.println("result is"+k);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
