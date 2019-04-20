package io.springmanagement.defecttracker.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.springmanagement.defecttracker.entities.Module;
import io.springmanagement.defecttracker.repositories.ModuleRepository;

@Service
public class ModuleServiceImpl implements ModuleService{

	@Autowired
	private ModuleRepository moduleRepository;
	

	public void saveModule(Module module) {
	
		moduleRepository.save(module);
		
	}


	@Override
	public List<Module> getAllModule() {
		// TODO Auto-generated method stub
		return moduleRepository.findAll();
	}


	@Override
	public Module getModuleById(Long mid) {
		// TODO Auto-generated method stub
		return moduleRepository.findByMid(mid);
	}


	@Override
	public void deleteModuleById(Long mid) {
		// TODO Auto-generated method stub
		moduleRepository.deleteById(mid);
	}

}
