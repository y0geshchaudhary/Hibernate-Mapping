/*package com.yogesh.ManyToMany;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class EmployeeDTO {

	private int employeeId;
	private String employeeName;
	private String password;
	private int age;
	private Set<RolesDTO> roles= new Set<RolesDTO>(0);
	
	@Id
	@Column(name="EmployeeId",nullable=false,length=10,unique=true)
	public int getEmployeeId() {
		return employeeId;
	}
	@Column(name="EmpName",length=20,nullable=false)
	public String getEmployeeName() {
		return employeeName;
	}
	@Column(name="Password",nullable=false,columnDefinition="varchar(20)")
	public String getPassword() {
		return password;
	}
	@Column(name="Age",length=2)
	public int getAge() {
		return age;
	}
	
	@ManyToMany
	public Set<RolesDTO> getRoles() {
		return roles;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setRoles(Set<RolesDTO> roles) {
		this.roles = roles;
	}

	
	
}
*/