package com.zensar.service;

import java.util.List;

import com.zensar.model.Employee;

public interface EmployeeService 
{

	
	public List<Employee> getEmployee(int empid);

	public Employee updateEmp(EmployeeDetail ad, String token, int id);

	Employee updateEmp1(EmployeeDetail ad, String token, int id);
}
