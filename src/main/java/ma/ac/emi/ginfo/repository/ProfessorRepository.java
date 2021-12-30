package ma.ac.emi.ginfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.ac.emi.ginfo.entities.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer> {

}
