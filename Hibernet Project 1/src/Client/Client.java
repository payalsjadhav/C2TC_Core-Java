package Client;

import crudoperation.entitise.Student;
import crudoperation.services.StudentServices;
import crudoperation.services.StudentServicesImpl;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentServices ss = new StudentServicesImpl();
		Student student = new Student();
		
		//Row1
		student.setId(12);
		student.setName("Payal");
		student.setRoll(12);
		student.setQualification("B.E");
		student.setYear(2021);
		student.setHallTicketNo(1323);
		student.setCourse("CSE");
		ss.addStudent(student);
		System.out.println("Row Inserted");
		
		
		//Row3
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Roshan");
		student1.setRoll(34);
		student1.setQualification("BE");
		student1.setYear(2022);
		student1.setHallTicketNo(1324);
		student1.setCourse("MECH");
		ss.addStudent(student1);
		System.out.println("Row Inserted");
		
		
		
		//Row3
		Student student2 = new Student();
		student2.setId(2);
		student2.setName("Naseer");
		student2.setRoll(35);
		student2.setQualification("B.Tech");
		student2.setYear(2020);
		student2.setHallTicketNo(1325);
		student2.setCourse("CIVIL");
		ss.addStudent(student2);
		System.out.println("Row Inserted");
		
		
		//Row4
		Student student3 = new Student();
		student3.setId(3);
		student3.setName("Aniket");
		student3.setRoll(36);
		student3.setQualification("MCA");
		student3.setYear(2023);
		student3.setHallTicketNo(138);
		student3.setCourse("Cs");
		ss.addStudent(student3);
		
		System.out.println("Row Inserted");
		

	}

}
