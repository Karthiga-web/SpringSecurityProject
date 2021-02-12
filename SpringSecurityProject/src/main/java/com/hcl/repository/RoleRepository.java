package com.hcl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long>{

}
