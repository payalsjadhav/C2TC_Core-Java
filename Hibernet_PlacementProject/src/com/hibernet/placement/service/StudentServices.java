package com.hibernet.placement.service;

import com.hibernet.placement.entitise.Student;

public interface StudentServices {
	
	Student findStudentById(int id);
	void addStudent(Student student);
	void updateStudent(Student student);
	void removeStudent(Student student);
	

}

