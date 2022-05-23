package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentPreparedStatmentsInsert {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pt = null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/b3tns");
			pt = con.prepareStatement("insert into students values(?,?,?)");
			pt.setInt(1, 1);
			pt.setString(2, "Payal");
			pt.setInt(3,20);
		    boolean i = pt.execute();
			System.out.println("No of rows affected:"+ i);
			System.out.println("Rows inserted successfully");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally
		{
			try {
				if(pt!=null) {
					pt.close();
					pt = null;
					
				}
				
			}
			catch(Exception e) {
				System.out.println(e);
				
			}
			try
			{
				if(con!=null) {
					con.close();
					con = null;
				}
			}
			catch(Exception e) {
				System.out.println(e);
				
			}
		}

	}

}
