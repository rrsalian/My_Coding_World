package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Model {

	String custid =null;
	String psw=null;
	String acno=null;
	String balance=null;
	Connection con=null;
	PreparedStatement  pstmt=null;
	ResultSet res=null;

	public Model() {
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		} 
		catch (Exception e) {
			System.out.println("Driver is not loaded and Connection not established");
		}
	}

	public void setCustid(String custid) {
		this.custid=custid;
	}
	public void setPsw(String psw) {
		this.psw=psw;
	}
	
	public String getAcNo() {
		return this.acno;
	}
	
	public void setAcNo(String acno) {
		this.acno=acno;
	}
	
	public String getBalance() {
		return this.balance;
	}
	//Login
	public boolean login() {
		try {
			pstmt=con.prepareStatement("select * from bank_abc where custid=? and psw=?");
			pstmt.setString(1, this.custid);
			pstmt.setString(2, this.psw);
			res=pstmt.executeQuery();
			
			if(res.next()==true) {
				acno=res.getString("ACNO");
				return true;
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}
	
	//Check Balance
	public boolean checkBalance() {
		
	
		try {
			pstmt=con.prepareStatement("select  * from bank_abc where acno=?");
			pstmt.setString(1, this.acno);
			res=pstmt.executeQuery();
			
			if(res.next()==true) {
				balance=res.getString("BALANCE");
				return true;
			}
			
		}
		catch(Exception e) {
			System.out.println("Sql error");
		}
		return false;
		
	}

}
