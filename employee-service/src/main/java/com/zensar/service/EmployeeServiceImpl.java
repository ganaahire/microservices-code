package com.zensar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zensar.controller.EmployeeFeignClient;
import com.zensar.model.Employee;
import com.zensar.repo.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	EmployeeRepository er;
	
	@Autowired
	EmployeeFeignClient uf;
	
	
		@Override
		@Transactional
		public Employee updateEmp1(EmployeeDetail Ed, String token,int id) {
			boolean val = uf.validateToken(token);
			if(val) {
				Employee a = er.findById(id).orElse(null);
				if(a!=null) {
				a.setEmpid(Ed.getEmpid());
				a.setName(Ed.getName());
				a.setDepid(Ed.getDepid());
				long millis=System.currentTimeMillis();  
		        java.sql.Date date=new java.sql.Date(millis); 
				}
				er.save(a);
				return a;
				}else {
					return null;
				}
			}
		




		@Override
		public List<Employee> getEmployee(int empid) {
			// TODO Auto-generated method stub
			return null;
		}




		@Override
		public Employee updateEmp(EmployeeDetail ad, String token, int id) {
			// TODO Auto-generated method stub
			return null;
		}

}
