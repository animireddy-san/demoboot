package com.vijtech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vijtech.entity.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

	Department findDepartmentById(Long departmentId);

}
