package com.ganesh.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ganesh.api.models.ERole;
import com.ganesh.api.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<ERole, Integer> {
	
	Optional<Role> findByName(ERole name);

}
