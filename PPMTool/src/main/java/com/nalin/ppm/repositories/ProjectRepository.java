package com.nalin.ppm.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nalin.ppm.domain.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long>{
	
	@Override
	Iterable<Project> findAllById(Iterable<Long> ids);

}
