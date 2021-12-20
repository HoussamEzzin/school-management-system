package ma.ac.emi.ginfo.entities;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Professor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer professorId;
	
	private String professorFirstName;
	
	private String professorLastName;
	
	private Date professorBirthDay;
	
	private ArrayList<Integer> professorLevels;
	
	private ArrayList<String> professorOptions;
	
	@OneToMany
	private ArrayList<Course> professorCourses;
	
	@ManyToMany
	private ArrayList<Classroom> professorClassrooms;

	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Professor(String professorFirstName, String professorLastName, Date professorBirthDay,
			ArrayList<Integer> professorLevels, ArrayList<String> professorOptions, ArrayList<Course> professorCourses,
			ArrayList<Classroom> professorClassrooms) {
		super();
		this.professorFirstName = professorFirstName;
		this.professorLastName = professorLastName;
		this.professorBirthDay = professorBirthDay;
		this.professorLevels = professorLevels;
		this.professorOptions = professorOptions;
		this.professorCourses = professorCourses;
		this.professorClassrooms = professorClassrooms;
	}

	public Integer getProfessorId() {
		return professorId;
	}

	public void setProfessorId(Integer professorId) {
		this.professorId = professorId;
	}

	public String getProfessorFirstName() {
		return professorFirstName;
	}

	public void setProfessorFirstName(String professorFirstName) {
		this.professorFirstName = professorFirstName;
	}

	public String getProfessorLastName() {
		return professorLastName;
	}

	public void setProfessorLastName(String professorLastName) {
		this.professorLastName = professorLastName;
	}

	public Date getProfessorBirthDay() {
		return professorBirthDay;
	}

	public void setProfessorBirthDay(Date professorBirthDay) {
		this.professorBirthDay = professorBirthDay;
	}

	public ArrayList<Integer> getProfessorLevels() {
		return professorLevels;
	}

	public void setProfessorLevels(ArrayList<Integer> professorLevels) {
		this.professorLevels = professorLevels;
	}

	public ArrayList<String> getProfessorOptions() {
		return professorOptions;
	}

	public void setProfessorOptions(ArrayList<String> professorOptions) {
		this.professorOptions = professorOptions;
	}

	public ArrayList<Course> getProfessorCourses() {
		return professorCourses;
	}

	public void setProfessorCourses(ArrayList<Course> professorCourses) {
		this.professorCourses = professorCourses;
	}

	public ArrayList<Classroom> getProfessorClassrooms() {
		return professorClassrooms;
	}

	public void setProfessorClassrooms(ArrayList<Classroom> professorClassrooms) {
		this.professorClassrooms = professorClassrooms;
	}
	
	

}
