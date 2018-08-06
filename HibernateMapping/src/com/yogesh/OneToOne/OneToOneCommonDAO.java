/*package com.yogesh.OneToOne;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class OneToOneCommonDAO 
{
	@Autowired
	SessionFactory sessionFactory;

	public void saveStudent(Student student)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(student);
	}

	public void getStudent(String name) {
		
		Student student=(Student) sessionFactory.getCurrentSession().createCriteria(Student.class).add(Restrictions.eq("name", name)).list().get(0);
		
		sessionFactory.getCurrentSession().delete(student);
	}
	
	public void saveStudentDetails(StudentDetails studentDetails)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(studentDetails);
	}

	public StudentDetails getStudenDetails(String phn) {
		
		StudentDetails stu = (StudentDetails) sessionFactory.getCurrentSession().createQuery("From StudentDetails where phn=:phn").setString("phn",phn).list().get(0);
		sessionFactory.getCurrentSession().clear();
		//sessionFactory.getCurrentSession().close();
		return stu;
	}

}
*/