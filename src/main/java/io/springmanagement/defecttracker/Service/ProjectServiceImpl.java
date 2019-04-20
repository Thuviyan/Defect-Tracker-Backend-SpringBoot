package io.springmanagement.defecttracker.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.springmanagement.defecttracker.entities.Project;
import io.springmanagement.defecttracker.repositories.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService {

	
	@Autowired
	private ProjectRepository  projectRepository;
	
	@Override
	public void saveProject(Project project) {
		
		projectRepository.save(project);
	}

	@Override
	public List<Project> getAllProject() {
		// TODO Auto-generated method stub
		return projectRepository.findAll();
	}

	@Override
	public Project getProjectById(Long id) {
		// TODO Auto-generated method stub
		return projectRepository.getById(id);
	}

	@Override
	public void deleteProjectById(Long id) {
		// TODO Auto-generated method stub
		projectRepository.deleteById(id);
	}

	
	
}
