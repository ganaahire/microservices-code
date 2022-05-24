
package com.zensar.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Employee {
	@Id
	private int empid;
	private String name;
	@JsonIgnore
	private int depid;
	@Transient
	private String department;
	
	public Employee(int empid, String name, int depid, String department) {
		super();
		this.empid = empid;
		this.name = name;
		this.depid = depid;
		this.department = department;
	}
	public Employee(int empid, String name, int depid) {
		super();
		this.empid = empid;
		this.name = name;
		this.depid = depid;
	}
	public Employee() {
		super();
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDepid() {
		return depid;
	}
	public void setDepid(int depid) {
		this.depid = depid;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", department=" + department + "]";
	}
	
	
}
