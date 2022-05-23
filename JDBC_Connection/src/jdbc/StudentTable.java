package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StudentTable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/b3tns","root","Payal@123");
			Statement st = con.createStatement();
			String s = "create table student(studentId int, studentName varchar(45),studentMarks int)";
			int i = st.executeUpdate(s);
			boolean t = st.execute("create table student1(studentId int, studentName varchar(45),studentMarks int)");
			System.out.println("No of rows affected:" + i);
			System.out.println("Query executed" + t);
			System.out.println("Table created Successfully");
			st.close();
			con.close();
			
		}
		catch(Exception e) {
			
		}

	}


}
