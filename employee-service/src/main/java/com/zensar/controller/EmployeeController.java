package com.zensar.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.model.Employee;
import com.zensar.service.EmployeeDetail;
import com.zensar.service.EmployeeService;

@RestController
public class EmployeeController
{

	@Autowired
	EmployeeService empService;
	
	@GetMapping("/employee/{empid}")
	@ResponseBody
	
	public Employee getEmployee(@PathVariable int empid) {
		
		Employee employee = empService.getEmployee(empid);
		return employee;
	}

	
}
