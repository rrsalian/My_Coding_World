package com.vturesult;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Get_Result
 */
@WebServlet("/Get_Result")
public class Get_Result extends HttpServlet {
	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet res=null;
	PrintWriter pw=null;
	//String username="scott";
	//String password="tiger";
	//String url="jdbc:oracle:thin:@localhost:1521:orcl,username,password";
	String a=null;
	String b=null;
	int c=0;
	int d=0;
	String usn=null;


	public void init() {



		try {

			//DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//System.out.println("Driver loaded succesfully");

			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		} 
		catch (Exception e) {
			System.out.println("Driver is not loaded and Connection not established");
		}
	}


	public void service(HttpServletRequest request,HttpServletResponse response) {


		try {

			usn=request.getParameter("usn");
			pw=response.getWriter();

			pstmt=con.prepareStatement("select * from vtu where usn=?");
			pstmt.setString(1, usn);
			res=pstmt.executeQuery();

			while(res.next()) {
				a=res.getString(1);
				b=res.getString(2);
				c=res.getInt(3);
				d=res.getInt(4);


				pw.println("Result");
				pw.println(" USN  :"+a );
				pw.println(" Name :"+b);
				pw.println(" M1   :"+c);
				pw.println(" M2   :"+d);

				HttpSession s=request.getSession(true);
				s.setAttribute("M1", c);
				s.setAttribute("M2", d);

				request.getServletContext().getRequestDispatcher("/PrintPercentage").include(request, response);

			}
		} 

		catch (Exception e) {
			System.out.println("Query problem");

		}

	}



	public void destroy() {
		try {
			res.close();
			con.close();
			pstmt.close();
		} 
		catch (SQLException e) {
			System.out.println("Destroy problem");

		}

	}

}
