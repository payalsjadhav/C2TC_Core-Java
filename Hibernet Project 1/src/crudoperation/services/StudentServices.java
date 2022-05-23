package crudoperation.services;

import crudoperation.entitise.Student;

public interface StudentServices {
	
	Student findStudentById(int id);
	void addStudent(Student student);
	void updateStudent(Student student);
	void removeStudent(Student student);
	

}
