package ma.ac.emi.ginfo.entities;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Classroom {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer classroomId;
	
	private String classroomName;
	
	private String classroomOption;
	
	private Integer classroomLevel;
	
	@OneToMany
	private List<Student> classroomStudents;
	
	@ManyToMany
	private List<Professor> classroomProfessors;
	
	@ManyToMany
	private List<Course> classroomCourses;

	public Classroom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Classroom(String classroomName, String classroomOption, Integer classroomLevel,
			List<Student> classroomStudents, List<Professor> classroomProfessors,
			List<Course> classroomCourses) {
		super();
		this.classroomName = classroomName;
		this.classroomOption = classroomOption;
		this.classroomLevel = classroomLevel;
		this.classroomStudents = classroomStudents;
		this.classroomProfessors = classroomProfessors;
		this.classroomCourses = classroomCourses;
	}

	public Integer getClassroomId() {
		return classroomId;
	}

	public void setClassroomId(Integer classroomId) {
		this.classroomId = classroomId;
	}

	public String getClassroomName() {
		return classroomName;
	}

	public void setClassroomName(String classroomName) {
		this.classroomName = classroomName;
	}

	public String getClassroomOption() {
		return classroomOption;
	}

	public void setClassroomOption(String classroomOption) {
		this.classroomOption = classroomOption;
	}

	public Integer getClassroomLevel() {
		return classroomLevel;
	}

	public void setClassroomLevel(Integer classroomLevel) {
		this.classroomLevel = classroomLevel;
	}

	public List<Student> getClassroomStudents() {
		return classroomStudents;
	}

	public void setClassroomStudents(List<Student> classroomStudents) {
		this.classroomStudents = classroomStudents;
	}

	public void setClassroomStudents(ArrayList<Student> classroomStudents) {
		this.classroomStudents = classroomStudents;
	}

	public void setClassroomProfessors(List<Professor> classroomProfessors) {
		this.classroomProfessors = classroomProfessors;
	}

	public List<Professor> getClassroomProfessors() {
		return classroomProfessors;
	}

	public void setClassroomProfessors(ArrayList<Professor> classroomProfessors) {
		this.classroomProfessors = classroomProfessors;
	}

	public void setClassroomCourses(List<Course> classroomCourses) {
		this.classroomCourses = classroomCourses;
	}

	public List<Course> getClassroomCourses() {
		return classroomCourses;
	}

	public void setClassroomCourses(ArrayList<Course> classroomCourses) {
		this.classroomCourses = classroomCourses;
	}
	
	
}
