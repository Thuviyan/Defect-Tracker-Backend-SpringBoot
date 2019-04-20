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

import io.springmanagement.defecttracker.Service.ModuleService;
import io.springmanagement.defecttracker.entities.Module;

@RestController
public class ModuleController {

	@Autowired
	private ModuleService moduleService;
	
	@PostMapping(value="/SaveModule")
	public HttpStatus createModule(@Valid @RequestBody Module module) {
		moduleService.saveModule(module);
		return HttpStatus.CREATED;
	}
	
	@GetMapping(value="/AllModule")
	public List<Module> getAllModule() {
		return moduleService.getAllModule();
	}
	
	@GetMapping(value="/Module/{mid}")
	public Module getModuleById(@PathVariable Long mid) {
		return moduleService.getModuleById(mid);
	}
	
	@DeleteMapping(value="/Module/{mid}")
	public HttpStatus deleteModuleById(@PathVariable Long mid) {
		moduleService.deleteModuleById(mid);
		return HttpStatus.OK;
	} 
}
