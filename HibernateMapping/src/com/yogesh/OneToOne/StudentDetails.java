/*package com.yogesh.OneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="StudentDetails")
public class StudentDetails 
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="phoneNo",nullable=false, length=10)
	private String phn;
	
	@OneToOne(mappedBy="studentDetails", cascade=CascadeType.ALL,orphanRemoval=true)
	private Student student;
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getId() {
		return id;
	}

	public String getPhn() {
		return phn;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPhn(String phn) {
		this.phn = phn;
	}

	
}
*/