package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("/JDBC_Connection/src/ /*com.mysql.cj.jdbc.Driver*/");//Step 2 class loader
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/root");
		
		Statement st = con.createStatement();//Step 4
		//String query1 = "insert into employee values(1,"Shivani",20000)";
		//String query = "select*from student";
		ResultSet rs = st.executeQuery("SELECT ID,SName,Sarks FROM student");
		while(rs.next())
		{
			System.out.println(rs.getString(1));  //First Column
			System.out.println(rs.getString(2));  //Second Column
			System.out.println(rs.getString(3));  //Third Column
			
		}
		//st.executeUpdate(query1);
		//System.out.println("Student Table created successfully");
		
		//System.out.println("Row inserted successfully");
		st.close();
		con.close();
		
		

	}

}
