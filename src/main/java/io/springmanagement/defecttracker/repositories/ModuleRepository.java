package io.springmanagement.defecttracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.springmanagement.defecttracker.entities.Module;

@Repository
public interface ModuleRepository extends JpaRepository<Module, Long> {

	Module findByMid(Long mid);
}
