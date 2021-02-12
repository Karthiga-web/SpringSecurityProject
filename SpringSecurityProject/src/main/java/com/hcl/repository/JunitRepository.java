package com.hcl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hcl.entity.JunitEntity;

@Repository
public interface JunitRepository extends JpaRepository<JunitEntity, Integer> {
	JunitEntity findByUsername(String username);
}
