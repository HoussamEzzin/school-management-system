package ma.ac.emi.ginfo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Exam {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer examId;
	
	private String examTitle;
	
	private String examDescription;
	
	private Integer examLevel;
	
	private String examOption;
	
	private Professor professor;
	
	private Course course;

	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Exam(String examTitle, String examDescription, Integer examLevel, String examOption, Professor professor,
			Course course) {
		super();
		this.examTitle = examTitle;
		this.examDescription = examDescription;
		this.examLevel = examLevel;
		this.examOption = examOption;
		this.professor = professor;
		this.course = course;
	}

	public Integer getExamId() {
		return examId;
	}

	public void setExamId(Integer examId) {
		this.examId = examId;
	}

	public String getExamTitle() {
		return examTitle;
	}

	public void setExamTitle(String examTitle) {
		this.examTitle = examTitle;
	}

	public String getExamDescription() {
		return examDescription;
	}

	public void setExamDescription(String examDescription) {
		this.examDescription = examDescription;
	}

	public Integer getExamLevel() {
		return examLevel;
	}

	public void setExamLevel(Integer examLevel) {
		this.examLevel = examLevel;
	}

	public String getExamOption() {
		return examOption;
	}

	public void setExamOption(String examOption) {
		this.examOption = examOption;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	

}
