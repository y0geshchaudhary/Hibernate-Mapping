/*package com.yogesh.ManyToMany;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.yogesh.ManyToMany.EmployeeDTO;
import com.yogesh.ManyToMany.RolesDTO;

@Repository
@Transactional
public class CommonDAO
{
	@Autowired
	SessionFactory sessionFactory;

	public void saveRoles(RolesDTO rolesDTO) 
	{
		sessionFactory.getCurrentSession().saveOrUpdate(rolesDTO);
		
	}

	public void addEmployee(EmployeeDTO employee) {
		sessionFactory.getCurrentSession().saveOrUpdate(employee);
		
	}
	
	@Autowired
	EmployeeDTO employeeDTO;
	
	@Autowired
	RolesDTO rolesDTO;
}
*/