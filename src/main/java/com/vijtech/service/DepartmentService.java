package com.vijtech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vijtech.entity.Department;
import com.vijtech.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	DepartmentRepository departmentRepository;

	public Department saveDepartment(Department dept) {
	
		return departmentRepository.save(dept);
	}

	public Department findDepartmentById(Long departmentId) {
		
		return departmentRepository.findDepartmentById(departmentId);
		
	}

}
