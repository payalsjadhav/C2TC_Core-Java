package com.hibernet.placement.service;

import com.hibernet.placement.dao.StudentDAO;
import com.hibernet.placement.dao.StudentDAOImpl;
import com.hibernet.placement.entitise.Student;

public class StudentServicesImpl implements StudentServices
{
	
    private StudentDAO dao;
	
	public StudentServicesImpl() {
		dao = new StudentDAOImpl();
	}

	
	public Student findStudentById(int id) {
		// TODO Auto-generated method stub
		Student student = dao.getStudentById(id);
		
		return student;
	}

	
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
		
	}

	
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
	}

	
	public void removeStudent(Student student) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.commitTransaction();
	}


}
