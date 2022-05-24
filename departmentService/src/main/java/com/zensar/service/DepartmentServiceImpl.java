package com.zensar.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.model.Department;
import com.zensar.repo.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentRepository er;

	
	@Override
	public List<Department> getDepartment(int depid) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
