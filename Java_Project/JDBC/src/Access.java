import java.sql.*;
class Access{
	public static void main(String[] args)  {
		Connection con=null;
		Statement stm;
		ResultSet res=null;

		try {
			
			//DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			
		} 
		catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		 try {
			stm=con.createStatement();
			res=stm.executeQuery("select * from emp");
			
			
			ResultSetMetaData rsmd=res.getMetaData();
			for (int i = 1; i <rsmd.getColumnCount(); i++) {
				System.out.println(rsmd.getColumnName(i)+" "+rsmd.getColumnTypeName(i));
				
			}
			
			System.out.println();
			
			while(res.next()==true) {
				System.out.println(res.getInt("EMPNO")+" "+res.getString("ENAME")+" "+res.getString("JOB"));
			}
			
		} 
		 catch (SQLException e) {
			e.printStackTrace();
		}	 

	}
}