/*package com.yogesh.ManyToMany;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Roles")
public class RolesDTO
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="RoleId")
	private int role_id;
	
	@NotNull
	@Column(name="Role", nullable=false,unique=true)
	private String role;
	
	@ManyToMany(mappedBy="roles")
	private Set<EmployeeDTO> employees;
	
	public Set<EmployeeDTO> getEmployee() {
		return employees;
	}
	public void setEmployee(Set<EmployeeDTO> employee) {
		this.employees = employee;
	}
	public int getRole_id() {
		return role_id;
	}
	public String getRole() {
		return role;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	
	
}
*/