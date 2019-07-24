package Model;

import java.sql.*;

public class Record {


	Connection con=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/record","root","root");   
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

	public boolean check(String email,String pass) throws SQLException  {
	
		try {
			pst=con.prepareStatement("select * from users where email=? and pass=?");
			pst.setString(1, email);
			pst.setString(2, pass);
			rs=pst.executeQuery();

			if(rs.next()) {
				return true;
			}
			return false;	
		}
		finally {
			con.close();
		}
	}


	public boolean register(String name,String email,String phone,String pass) throws SQLException  {
		
		
		pst=con.prepareStatement("insert ignore into users values(?,?,?,?)");
		pst.setString(1, name);
		pst.setString(2, email);
		pst.setString(3, phone);
		pst.setString(4, pass);
		if(pst.executeUpdate()!=1) {
		return false;
		}
		else {
			return true;
		}
		
	}

}
