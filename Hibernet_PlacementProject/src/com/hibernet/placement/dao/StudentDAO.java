package com.hibernet.placement.dao;

import com.hibernet.placement.entitise.Student;

public interface StudentDAO {
	
	Student getStudentById(int id);
	void addStudent(Student student);
	void removeStudent(Student student);
	void updateStudent(Student student);
	void commitTransaction();
	void beginTransaction();

}
