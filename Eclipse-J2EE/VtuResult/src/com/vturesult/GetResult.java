package com.vturesult;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetResult extends HttpServlet {
	
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
			System.out.println("Driver loaded succesfully");
			
		} 
		catch (Exception e) {
			System.out.println("Driver not loaded ");
			
		}	
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		} catch (SQLException e) {
			System.out.println("Connection not established");
		}
	}
	
	
	public void service(HttpServletRequest request,HttpServletResponse response) {
		
		
		try {
			
			usn=request.getParameter("usn");
			pw=response.getWriter();
		} 
		catch (IOException e) {
			System.out.println("usn problem");
			
		}
			if(usn.length()!=10) {
				pw.println("invlaid usn");
			}
			else {
				try {
					pstmt=con.prepareStatement("select * from vtu where usm=?");
					pstmt.setString(1, usn);
					res=pstmt.executeQuery();
					
					while(res.next()) {
						a=res.getString(1);
						b=res.getString(2);
						c=res.getInt(3);
						d=res.getInt(4);
					}
					
					pw.println("USN:"+a+" Name:"+b+" M1:"+c+" M2"+d);
				} 
				
				catch (SQLException e) {
					System.out.println("Query problem");
					
				}
				
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
