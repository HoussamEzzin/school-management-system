package ma.ac.emi.ginfo.service;

import java.util.List;

import ma.ac.emi.ginfo.entities.Student;

public interface StudentService {
	List<Student> getAllStudents();
	int getStudentNumber();
	void saveStudent(Student student);
	Student getStudentById(Integer id);
	void deleteStudentById(Integer id);

	
}
