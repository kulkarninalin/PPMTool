package com.nalin.ppm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nalin.ppm.domain.Project;
import com.nalin.ppm.services.ProjectService;

@RestController
@RequestMapping("/api/project")
public class ProjectController {
	
	
	@Autowired
	private ProjectService projectService;
	
	@PostMapping("/sa")
	public ResponseEntity<Project> createNewProject(@RequestBody Project project){
		Project proj1=projectService.saveOrUpdateProject(project);
		return new ResponseEntity<Project>(proj1,HttpStatus.CREATED);
	}
	
	

}
