package com.zensar.controller;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="Department-Service")
public interface DepartmentFeignClient {
	
	@GetMapping(path="/department/{depid}")
	public String getDep1(@PathVariable("depid") int depid);
	
}

