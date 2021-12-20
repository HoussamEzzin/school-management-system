package ma.ac.emi.ginfo.entities;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Student(String studentFirstName, String studentLastName, Date studentBirthDay, Integer studentLevel,
			String studentOption) {
		super();
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentBirthDay = studentBirthDay;
		this.studentLevel = studentLevel;
		this.studentOption = studentOption;
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
