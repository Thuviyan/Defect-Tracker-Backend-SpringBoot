package io.springmanagement.defecttracker.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//import com.fasterxml.jackson.databind.Module;

@Entity
@Table(name="project_table")
public class Project  implements Serializable{

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	

	private String projectName;
	
	@OneToMany(mappedBy="project", cascade= {CascadeType.ALL})
	private List<Module> module;
	
	
	public List<Module> getModule() {
		return module;
	}

	public void setModules(List<Module> module) {
	this.module = module;
	}



	public Project(Long id, String projectName) {
		super();
		this.id = id;
		this.projectName = projectName;
	}
	
	

	public Project() {
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	
}
