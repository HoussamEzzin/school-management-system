package ma.ac.emi.ginfo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ac.emi.ginfo.entities.Professor;
import ma.ac.emi.ginfo.repository.ProfessorRepository;

@Service
public class ProfessorServiceImpl implements ProfessorService {
	
	@Autowired
	ProfessorRepository professorRepository;

	@Override
	public List<Professor> getAllProfessors() {
		// TODO Auto-generated method stub
		return professorRepository.findAll();
	}

	@Override
	public int getProfessorNumber() {
		// TODO Auto-generated method stub
		return professorRepository.findAll().size();
	}

	@Override
	public void saveProfessor(Professor professor) {
		// TODO Auto-generated method stub
		this.professorRepository.save(professor);
	}

	@Override
	public Professor getProfessorById(Integer id) {
		Optional<Professor> optional = professorRepository.findById(id);
		Professor professor = null;
		if(optional.isPresent()) {
			professor = optional.get();
		}else {
			throw new RuntimeException("Professor not Fond for id :"+id);
		}
		return professor;
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteProfessorById(Integer id) {
		// TODO Auto-generated method stub
		this.professorRepository.deleteById(id);
	}
	
	
}
