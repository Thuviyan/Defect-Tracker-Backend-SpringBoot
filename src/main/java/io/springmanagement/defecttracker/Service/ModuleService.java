package io.springmanagement.defecttracker.Service;

import java.util.List;

import io.springmanagement.defecttracker.entities.Module;

public interface ModuleService {

	void saveModule(Module module);
	List<Module> getAllModule();
	Module getModuleById(Long mid);
	void deleteModuleById(Long mid);
}
