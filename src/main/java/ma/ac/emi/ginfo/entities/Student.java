package ma.ac.emi.ginfo.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentId;
	
	private String studentFirstName;
	
	private String studentLastName;
	
	private Date studentBirthDay;
	
	private Integer studentLevel;
	
	private String studentOption;
	
	@ManyToOne
	private Classroom studentClassroom;
	
	@OneToMany
	private List<Course> studentCourses;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Student(String studentFirstName, String studentLastName, Date studentBirthDay, Integer studentLevel,
			String studentOption,Classroom studentClassroom, List<Course> studentCourses) {
		super();
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentBirthDay = studentBirthDay;
		this.studentLevel = studentLevel;
		this.studentOption = studentOption;
		this.studentClassroom = studentClassroom;
		this.studentCourses = studentCourses;
	}

	

	public Classroom getStudentClassroom() {
		return studentClassroom;
	}



	public void setStudentClassroom(Classroom studentClassroom) {
		this.studentClassroom = studentClassroom;
	}



	public List<Course> getStudentCourses() {
		return studentCourses;
	}
	
	



	public void setStudentCourses(List<Course> studentCourses) {
		this.studentCourses = studentCourses;
	}



	public void setStudentCourses(ArrayList<Course> studentCourses) {
		this.studentCourses = studentCourses;
	}



	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public Date getStudentBirthDay() {
		return studentBirthDay;
	}

	public void setStudentBirthDay(Date studentBirthDay) {
		this.studentBirthDay = studentBirthDay;
	}

	public Integer getStudentLevel() {
		return studentLevel;
	}

	public void setStudentLevel(Integer studentLevel) {
		this.studentLevel = studentLevel;
	}

	public String getStudentOption() {
		return studentOption;
	}

	public void setStudentOption(String studentOption) {
		this.studentOption = studentOption;
	}
	
	

}
