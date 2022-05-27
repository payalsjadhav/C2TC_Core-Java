
//Web Based Placement Management System using Certificate Authentication

package com.hibernet.placement.client;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hibernet.placement.entitise.Admin;
import com.hibernet.placement.entitise.Certificate;
import com.hibernet.placement.entitise.College;
import com.hibernet.placement.entitise.Placement;
import com.hibernet.placement.entitise.Student;
import com.hibernet.placement.entitise.User;
import com.hibernet.placement.service.AdminServices;
import com.hibernet.placement.service.AdminServicesImpl;
import com.hibernet.placement.service.CertificateServices;
import com.hibernet.placement.service.CertificateServicesImpl;
import com.hibernet.placement.service.CollegeServices;
import com.hibernet.placement.service.CollegeServicesImpl;
import com.hibernet.placement.service.PlacementServices;
import com.hibernet.placement.service.PlacementServicesImpl;
import com.hibernet.placement.service.StudentServices;
import com.hibernet.placement.service.StudentServicesImpl;
import com.hibernet.placement.service.UserServices;
import com.hibernet.placement.service.UserServicesImpl;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		EntityManagerFactory factory =  Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		
		
		StudentServices ss = new StudentServicesImpl();
		AdminServices as = new AdminServicesImpl();
		CollegeServices cs =new CollegeServicesImpl();
		UserServices us = new UserServicesImpl();
		CertificateServices Cs= new CertificateServicesImpl();
		PlacementServices ps = new PlacementServicesImpl();
		
		//FOR STUDENT
		//Row1
		Student student = new Student();
		student.setName("aniket");
		student.setRoll(12);
		student.setQualification("MCA");
		student.setYear(2021);
		student.setHallTicketNo(1323);
		student.setCourse("CS");
	//ss.addStudent(student);
		System.out.println("Row Inserted");
		
		
		//Row2
		Student student1 = new Student();
		student1.setName("Roshan");
		student1.setRoll(34);
		student1.setQualification("BE");
		student1.setYear(2022);
		student1.setHallTicketNo(1324);
		student1.setCourse("MECH");
		//ss.addStudent(student1);
		System.out.println("Row Inserted");
		
		
		
		
		//FOR ADMIN
		//Row1
		Admin admin = new Admin();
		admin.setAdminId(1234);
		admin.setAdminName("Aniket");
		admin.setAdminPassword("Ani@123");
		//as.addAdmin(admin);
		
		//Row2
	    Admin admin1 = new Admin();
	    admin1.setAdminId(1453);
	    admin1.setAdminName("payal");
	    admin1.setAdminPassword("payal@563");
	    //as.addAdmin(admin1);
		
	    
	    
		//FOR COLLEGE
		//Row1
		College college =new College();	
		college.setCollegeId(343);
		college.setCollegeName("BCOE");
		college.setLocation("Thane");
		//cs.addCollege(college);
		
		
		//Row2
		College college1 =new College();	
		college1.setCollegeId(344);
		college1.setCollegeName("ACPCOI");
		college1.setLocation("Navi Mumbai");
		//cs.addCollege(college1);
		
		
		
		//FOR USER
		//Row1
		User user = new User();
		user.setUserId(7898); 
		user.setUserName("Mohtasim"); 
		user.setUserPassword("moh#123"); 
		user.setUserType("student"); 
		//us.addUser(user);
		
		
		//Row1
		User user1 = new User();
		user1.setUserId(7834); 
		user1.setUserName("diya"); 
		user1.setUserPassword("diy&134"); 
		user1.setUserType("Teacher"); 
		//us.addUser(user1);
		
			
	     
		//FOR CERTIFICATE
		//Row1
		Certificate certificate= new Certificate();
		certificate.setCollege("BCOE");
		certificate.setPassingyear(2021);
		certificate.setStudentid(1);
		//Cs.addCertificate(certificate);
		
		//Row2
		Certificate certificate1= new Certificate();
		certificate1.setCollege("ACPCOI");
		certificate1.setPassingyear(2020);
		certificate1.setStudentid(2);
		//Cs.addCertificate(certificate1);
		
		
		
		//FOR PLACEMENTS
		//Row 1
		LocalDate date =LocalDate.of(2022, 5, 25);
		Placement  placement = new Placement() ;
		placement.setDate(date);
		placement.setName("capgemini");
		placement.setPlacementId(243);
		placement.setQualification("B.E");
		placement.setYear(2021);
		//ps.addPlacement(placement);
				
		
		//Row 2
		LocalDate date1 =LocalDate.of(2022, 6, 4);
		Placement  placement1 = new Placement() ;
		placement1.setDate(date1);
		placement1.setName("TCS");
		placement1.setPlacementId(223);
		placement1.setQualification("MCA");
		placement1.setYear(2020);
		//ps.addPlacement(placement1);
		
	
		
		
	     //MAPPING ONE TO ONE
		
		//1 to 1 student and certificate
       student.setStudentCertificate(certificate);
		em.persist(student);
		
		student1.setStudentCertificate(certificate1);
		em.persist(student1);
		
		
		//1 to 1 college and admin
		college.setAdmin(admin);
		em.persist(college);
		
		college1.setAdmin(admin1);
		em.persist(college1);
		
		
		//1 to 1 college and user
		college.setUser(user);
		em.persist(college);
		
		college1.setUser(user1);
		em.persist(college1);
		
		System.out.println("one to one mapping succesfull");
		
		
		
		//MAPPING ONE TO MANY
		student.setCollege(college);
		em.persist(student);
		
		student1.setCollege(college1);
		em.persist(student1);
		
		placement.setCollege(college);
		em.persist(placement);
		
		placement1.setCollege(college1);
		em.persist(placement1);
		
		certificate.setCollege(college);
		em.persist(certificate);
		
		certificate1.setCollege(college1);
		em.persist(certificate1);
		
		System.out.println("one to many mapping succesfull");
	
		
	
		
		//student.setCertificate(cf);
		
		//em.persist(student);
		System.out.println("Row Inserted");
		
		em.getTransaction().commit();		
		em.close();
		factory.close();
		
		
		
		
		/*//retrive operation
		student = ss.findStudentById(2);
		System.out.println("ID"+student.getId());
		System.out.println(student);
		
		//Update Operation
		student = ss.findStudentById(3);
		student.setName("Neha");
		student.setQualification("B.com");
		ss.updateStudent(student);
		System.out.println("Row updated");
		System.out.println(student);
		
		//Delete Operation 
		student = ss.findStudentById(1);
		System.out.println(student);
		ss.removeStudent(student);
		System.out.println("Row deleted");*/
		
		

	}

	

}