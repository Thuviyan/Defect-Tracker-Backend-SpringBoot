package io.springmanagement.defecttracker.Service;

import java.util.List;

//import java.util.List;

import io.springmanagement.defecttracker.entities.Project;

public interface ProjectService {
	
	void saveProject(Project project);
	List<Project> getAllProject();
	Project getProjectById(Long id);
	void deleteProjectById(Long id);

}
