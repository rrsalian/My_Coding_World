package info.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Accessing_Data {
	public static void main(String[] args) {
		Connection con=null;
		java.sql.Statement stmt=null;
		ResultSet res=null;
		PreparedStatement pstmt=null;
		//Loading Driver
		try {
			//DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded succesfully");
		} 
		
		catch (Exception e) {
			
			System.out.println("Driver Not loaded ");
		}
		
		
		//Connecting Driver
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			System.out.println("Connection Established");
		}
		catch (SQLException e) {
			
			System.out.println("Connection not established");
		}
		//Accessing Data
		try {
			pstmt=con.prepareStatement("insert into rakshith values(?,?,?)");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter SNO");
			int sno=sc.nextInt();
			System.out.println("Enter Name");
			String name=sc.next();
			System.out.println("Enter mobile no");
			Long mobile=sc.nextLong();
			pstmt.setInt(1, sno);
			pstmt.setString(2,name);
			pstmt.setLong(3,mobile);
			pstmt.executeUpdate();
			System.out.println("Query executed Successfully");
		} catch (SQLException e) {
			System.out.println("Query is not executed");
		}
		
		
	}
}
