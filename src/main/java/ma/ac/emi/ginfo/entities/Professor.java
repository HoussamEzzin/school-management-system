package ma.ac.emi.ginfo.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
	
	private Double professorSalary;
	
	@OneToMany
	private List<Course> professorCourses;
	
	@ManyToMany
	private List<Classroom> professorClassrooms;

	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Professor(String professorFirstName, String professorLastName, Date professorBirthDay,
			ArrayList<Integer> professorLevels,Double professorSalary) {
		super();
		this.professorFirstName = professorFirstName;
		this.professorLastName = professorLastName;
		this.professorBirthDay = professorBirthDay;
		this.professorLevels = professorLevels;
		this.professorSalary = professorSalary;
		this.professorOptions = new ArrayList<String>();
		this.professorCourses = new ArrayList<Course>();
		this.professorClassrooms = new ArrayList<Classroom>();
	}
	

	public Double getProfessorSalary() {
		return professorSalary;
	}

	public void setProfessorSalary(Double professorSalary) {
		this.professorSalary = professorSalary;
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

	public List<Course> getProfessorCourses() {
		return professorCourses;
	}
	

	public void setProfessorCourses(List<Course> professorCourses) {
		this.professorCourses = professorCourses;
	}

	public void setProfessorCourses(ArrayList<Course> professorCourses) {
		this.professorCourses = professorCourses;
	}

	public List<Classroom> getProfessorClassrooms() {
		return professorClassrooms;
	}

	public void setProfessorClassrooms(ArrayList<Classroom> professorClassrooms) {
		this.professorClassrooms = professorClassrooms;
	}

	public void setProfessorClassrooms(List<Classroom> professorClassrooms) {
		this.professorClassrooms = professorClassrooms;
	}
	
	

}
