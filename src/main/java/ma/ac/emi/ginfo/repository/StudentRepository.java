package ma.ac.emi.ginfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.ac.emi.ginfo.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
