package com.zensar.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="EMPLOYEE-SERVICE")
public interface EmployeeFeignClient {
	
	
	@RequestMapping("/employee/{empid}")
	public String getUser(@RequestHeader("Authorization") String jwt);

	public boolean validateToken(String token);
	
}
