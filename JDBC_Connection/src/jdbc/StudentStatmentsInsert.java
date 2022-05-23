package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class StudentStatmentsInsert {
	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/b3tns";
		Properties p = new Properties();
		p.put("user","root");
		p.put("password","Payal@123");
		Connection con = DriverManager.getConnection(url, p);
		Statement st = con.createStatement();
		String query = "insert into student value(1,'Payal',20)";
		int i  = st.executeUpdate(query);
		boolean t = st.execute ("insert into student value(2,'Divya',40)");
		System.out.println("No of rows affected:" + i);
		System.out.println("Query executed" + t);
		System.out.println("Row inserted Successfully");
		st.close();
		con.close();
		

	}

}
