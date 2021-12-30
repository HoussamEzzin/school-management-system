package ma.ac.emi.ginfo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ma.ac.emi.ginfo.entities.Professor;

@Service
public interface ProfessorService {
	List<Professor> getAllProfessors();
	int getProfessorNumber();
	void saveProfessor(Professor professor);
	Professor getProfessorById(Integer id); 
	void deleteProfessorById(Integer id);
}
