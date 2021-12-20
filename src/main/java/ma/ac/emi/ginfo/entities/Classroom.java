package ma.ac.emi.ginfo.entities;

import java.util.ArrayList;

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
	private ArrayList<Student> classroomStudents;
	
	@ManyToMany
	private ArrayList<Professor> classroomProfessors;
	
	@ManyToMany
	private ArrayList<Course> classroomCourses;

	public Classroom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Classroom(String classroomName, String classroomOption, Integer classroomLevel,
			ArrayList<Student> classroomStudents, ArrayList<Professor> classroomProfessors,
			ArrayList<Course> classroomCourses) {
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

	public ArrayList<Student> getClassroomStudents() {
		return classroomStudents;
	}

	public void setClassroomStudents(ArrayList<Student> classroomStudents) {
		this.classroomStudents = classroomStudents;
	}

	public ArrayList<Professor> getClassroomProfessors() {
		return classroomProfessors;
	}

	public void setClassroomProfessors(ArrayList<Professor> classroomProfessors) {
		this.classroomProfessors = classroomProfessors;
	}

	public ArrayList<Course> getClassroomCourses() {
		return classroomCourses;
	}

	public void setClassroomCourses(ArrayList<Course> classroomCourses) {
		this.classroomCourses = classroomCourses;
	}
	
	
}
