package ma.ac.emi.ginfo;



import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ma.ac.emi.ginfo.entities.Course;
import ma.ac.emi.ginfo.entities.Professor;
import ma.ac.emi.ginfo.service.CourseService;
import ma.ac.emi.ginfo.service.ProfessorService;

@SpringBootApplication
public class SchoolManagementSystemApplication {
	
	@Autowired
	CourseService courseService;
	
	@Autowired
	ProfessorService professorService;

	public static void main(String[] args) {
		SpringApplication.run(SchoolManagementSystemApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner console() {
		return args -> {
			ArrayList<Integer> proLevels = new ArrayList<Integer>();
			
			for(int i=1;i<4;i++) {
				proLevels.add(i);
			}
			
			Professor pro1 = new Professor("Mohammed","Kabbaj",new Date("14/02/1976"),proLevels,47000.00);
			Professor pro2 = new Professor("Dalila","Chiadmi",new Date("17/07/1961"),proLevels,98000.40);
			Professor pro3 = new Professor("Leila","Benhlima",new Date("06/05/1962"),proLevels,74000.00);
			Professor pro4 = new Professor("Anwar","Adil",new Date("29/09/1977"),proLevels,54000.00);
			professorService.saveProfessor(pro1);
			professorService.saveProfessor(pro2);
			professorService.saveProfessor(pro3);
			professorService.saveProfessor(pro4);
			Course c1 = new Course("Math","very smart subject",1,"GINF",pro1);
			Course c2 = new Course("Crypto","awsome",3,"GINF-TI",pro2);
			Course c3 = new Course("Angular","Dev Front-End",3,"GINF-IQL",pro4);
			Course c4 = new Course("Big Data","Traitement des donnees massives",3,"GINF-TI-IQL",pro3);
			Course c5 = new Course("Systemes Reparties","Distributed Systemes principles and design",2,"GINF-TI",pro2);
			Course c6 = new Course("Compliation","analyse lexicale et syntaxique",2,"GINF",pro2);
			Course c7 = new Course("MOO","Modelisation",2,"GINF",pro1);
			courseService.saveCourse(c1);
			courseService.saveCourse(c2);
			courseService.saveCourse(c3);
			courseService.saveCourse(c4);
			courseService.saveCourse(c5);
			courseService.saveCourse(c6);
			courseService.saveCourse(c7);
			
			
		};
	}

}
