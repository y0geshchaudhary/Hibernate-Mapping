/*package com.yogesh.OneToOne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OneToOneHibernateMapping {

	public static void main(String[] args) 
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/yogesh/config.xml");
		
		OneToOneCommonDAO commonDAO = (OneToOneCommonDAO) ctx.getBean("oneToOneCommonDAO");
		
		StudentDetails stuDetails= new StudentDetails();
		stuDetails.setPhn("9015212535");
		
		Student stu = new Student();
		stu.setName("Ram");
		stu.setStudentDetails(stuDetails);
		
		commonDAO.saveStudent(stu);
		
		StudentDetails stuDetails1 = commonDAO.getStudenDetails("123456");
		
		System.out.println(stuDetails1.getStudent().getName());
		
		Student student = new Student();
		student.setName("Nik");
		
		StudentDetails studentDetails = new StudentDetails();
		studentDetails.setPhn("9015212535");
		studentDetails.setStudent(student);
		student.setStudentDetails(studentDetails);
		
		commonDAO.saveStudentDetails(studentDetails);
		

	}

}
*/