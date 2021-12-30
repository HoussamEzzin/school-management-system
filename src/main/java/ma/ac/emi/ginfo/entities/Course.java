package ma.ac.emi.ginfo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer courseId;
	
	private String courseTitle;
	
	private String courseDescription;
	
	private Integer courseLevel;
	
	private String courseOption;
	
	@ManyToOne
	private Professor courseProfessor;
	
	@OneToMany
	private List<Exam> courseExams;
	
	@OneToMany
	private List<Classroom> courseClassrooms;
	
	@OneToMany
	private List<Topic> courseTopics;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	



	public Course(String courseTitle, String courseDescription, Integer courseLevel, String courseOption,
			Professor courseProfessor) {
		super();
		this.courseTitle = courseTitle;
		this.courseDescription = courseDescription;
		this.courseLevel = courseLevel;
		this.courseOption = courseOption;
		this.courseProfessor = courseProfessor;
		this.courseExams = new ArrayList<Exam>();
		this.courseTopics = new ArrayList<Topic>();
		this.courseClassrooms = new ArrayList<Classroom>();
	}

	



	

	public void setCourseExams(List<Exam> courseExams) {
		this.courseExams = courseExams;
	}







	public void setCourseClassrooms(List<Classroom> courseClassrooms) {
		this.courseClassrooms = courseClassrooms;
	}







	public void setCourseTopics(List<Topic> courseTopics) {
		this.courseTopics = courseTopics;
	}







	public List<Topic> getCourseTopics() {
		return courseTopics;
	}







	public void setCourseTopics(ArrayList<Topic> courseTopics) {
		this.courseTopics = courseTopics;
	}







	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public Integer getCourseLevel() {
		return courseLevel;
	}

	public void setCourseLevel(Integer courseLevel) {
		this.courseLevel = courseLevel;
	}

	public String getCourseOption() {
		return courseOption;
	}

	public void setCourseOption(String courseOption) {
		this.courseOption = courseOption;
	}

	public Professor getCourseProfessor() {
		return courseProfessor;
	}

	public void setCourseProfessor(Professor courseProfessor) {
		this.courseProfessor = courseProfessor;
	}

	public List<Exam> getCourseExams() {
		return courseExams;
	}

	public void setCourseExams(ArrayList<Exam> courseExams) {
		this.courseExams = courseExams;
	}







	public List<Classroom> getCourseClassrooms() {
		return courseClassrooms;
	}







	public void setCourseClassrooms(ArrayList<Classroom> courseClassrooms) {
		this.courseClassrooms = courseClassrooms;
	}
	
	
	
	
	
	
	

}
