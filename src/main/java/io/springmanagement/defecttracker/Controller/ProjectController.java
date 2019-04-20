package io.springmanagement.defecttracker.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.springmanagement.defecttracker.Service.ProjectService;
import io.springmanagement.defecttracker.entities.Project;

@RestController
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@PostMapping(value="/SaveProject")
	public HttpStatus createProject(@Valid @RequestBody Project project) {
		projectService.saveProject(project);
		return HttpStatus.CREATED;
	}
	
	@GetMapping(value="/All")
	public List<Project> getAllProject() {
		return projectService.getAllProject();
	}
	
	@GetMapping(value="/{id}")
	public Project getProjectById(@PathVariable Long id) {
		return projectService.getProjectById(id);
	}
	
	@DeleteMapping(value="/{id}")
	public HttpStatus deleteProjectById(@PathVariable Long id) {
		 projectService.deleteProjectById(id);
		 return HttpStatus.OK;
	}

}
