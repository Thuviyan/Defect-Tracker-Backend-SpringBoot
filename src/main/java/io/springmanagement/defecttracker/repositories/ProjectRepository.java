package io.springmanagement.defecttracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.springmanagement.defecttracker.entities.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

	Project getById(Long id);
}
