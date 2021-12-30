package ma.ac.emi.ginfo.entities;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Topic {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer topicId;
	
	private String topicName;
	
	private ArrayList<String> topicFiles;

	public Topic() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Topic(String topicName, ArrayList<String> topicFiles) {
		super();
		this.topicName = topicName;
		this.topicFiles = new ArrayList<String>();
	}

	public Integer getTopicId() {
		return topicId;
	}

	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public ArrayList<String> getTopicFiles() {
		return topicFiles;
	}

	public void setTopicFiles(ArrayList<String> topicFiles) {
		this.topicFiles = topicFiles;
	}
	
	
	
	

}
