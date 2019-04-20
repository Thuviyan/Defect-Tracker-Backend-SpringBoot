package io.springmanagement.defecttracker.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="module_table")
public class Module implements Serializable{
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	
	private Long mid;
	
	private String moduleName;
	
	@ManyToOne
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@JoinColumn(name="id", nullable=false)
	private Project project;

	public Long getId() {
		return mid;
	}

	public void setId(Long mid) {
		this.mid = mid;
	}


	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
	
	
}
