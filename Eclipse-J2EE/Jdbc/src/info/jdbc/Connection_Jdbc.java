package info.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection_Jdbc {

	public static void main(String[] args) {
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
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			System.out.println("Connection Established");
		}
		catch (SQLException e) {
			
			System.out.println("Connection not established");
		}
	}

}
