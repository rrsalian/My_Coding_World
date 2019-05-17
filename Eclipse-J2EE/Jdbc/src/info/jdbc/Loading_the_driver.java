package info.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Loading_the_driver {

	public static void main(String[] args) {
		try {
			//DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded succesfully");
		} 
		
		catch (Exception e) {
			
			System.out.println("Driver Not loaded ");
		}
	}

}
