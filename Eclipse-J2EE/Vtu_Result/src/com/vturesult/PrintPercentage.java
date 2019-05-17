package com.vturesult;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PrintPercentage
 */
@WebServlet("/PrintPercentage")
public class PrintPercentage extends HttpServlet {

	public void serviece(HttpServletRequest request,HttpServletResponse response) {
		try
		{
			HttpSession s=request.getSession();
			int m1=(int) s.getAttribute("M1");
			int m2=(int) s.getAttribute("M2");

			float percentage=((m1+m2)/200.0f)*100;


			PrintWriter pw	=response.getWriter();
			pw.println("The Percentage is :"+percentage);
		}
		catch(Exception e) {
			System.out.println("");
		}

	}

}
