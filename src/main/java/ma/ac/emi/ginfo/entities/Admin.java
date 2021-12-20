package ma.ac.emi.ginfo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer adminId;
	
	private String adminFirstName;
	
	private String adminLastName;
	
	private Date adminBirthDay;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(Integer adminId, String adminFirstName, String adminLastName, Date adminBirthDay) {
		super();
		this.adminFirstName = adminFirstName;
		this.adminLastName = adminLastName;
		this.adminBirthDay = adminBirthDay;
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getAdminFirstName() {
		return adminFirstName;
	}

	public void setAdminFirstName(String adminFirstName) {
		this.adminFirstName = adminFirstName;
	}

	public String getAdminLastName() {
		return adminLastName;
	}

	public void setAdminLastName(String adminLastName) {
		this.adminLastName = adminLastName;
	}

	public Date getAdminBirthDay() {
		return adminBirthDay;
	}

	public void setAdminBirthDay(Date adminBirthDay) {
		this.adminBirthDay = adminBirthDay;
	}
	
	
}
