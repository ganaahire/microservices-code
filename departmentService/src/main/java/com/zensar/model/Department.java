package com.zensar.model;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
	int  depid;
	int name;
	public Department(int depid, int name) {
		super();
		this.depid = depid;
		this.name = name;
	}
	public Department() {
		super();
	}
	public int getDepid() {
		return depid;
	}
	public void setDepid(int depid) {
		this.depid = depid;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Department [depid=" + depid + ", name=" + name + "]";
	}
	


}
