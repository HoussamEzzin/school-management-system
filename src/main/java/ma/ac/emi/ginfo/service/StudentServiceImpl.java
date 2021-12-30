package ma.ac.emi.ginfo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ac.emi.ginfo.repository.StudentRepository;

import ma.ac.emi.ginfo.entities.Student;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public int getStudentNumber() {
		// TODO Auto-generated method stub
		return studentRepository.findAll().size();
	}

	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		this.studentRepository.save(student);
		
	}

	@Override
	public Student getStudentById(Integer id) {
		// TODO Auto-generated method stub
		Optional<Student> optional = studentRepository.findById(id);
		Student student = null;
		if(optional.isPresent()) {
			student = optional.get();
		}else {
			throw new RuntimeException("Student not found for id :"+id);
		}
		
		return student;
	}

	@Override
	public void deleteStudentById(Integer id) {
		// TODO Auto-generated method stub
		this.studentRepository.deleteById(id);	
	}
	
}
