/*package com.yogesh.ManyToMany;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yogesh.ManyToMany.EmployeeDTO;
import com.yogesh.ManyToMany.RolesDTO;

public class HibernateMapping {

	public static void main(String[] args) {
		
		HibernateMapping hibernateMapping = new HibernateMapping();
		
		hibernateMapping.method();

	}

	private void method()
	{

			ApplicationContext context = new ClassPathXmlApplicationContext("com/yogesh/config.xml");
			
			CommonDAO commonDAO= (CommonDAO) context.getBean("commonDAO");
			EmployeeDTO employee = new EmployeeDTO();
			RolesDTO rolesDTO = new RolesDTO();
			rolesDTO.setRole("ABC");
			
			employee.setEmployeeName("Nik");
			employee.setPassword("password");
			employee.setAge(20);
			
			Set employeeRoles= (Set) employee.getRoles();
			
			employeeRoles.add(rolesDTO);
			employee.setRoles(employeeRoles);
			
			commonDAO.addEmployee(employee);
			commonDAO.saveRoles(rolesDTO);
		
	}

}
*/