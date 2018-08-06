/*package com.yogesh.ManyToMany;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Guest")
public class GuestDTO {
	
	private int stayId;
	private String guestName;
	//private String idNumber;
	//private int phnNo;
	//private String address;
	//private int noOfGuest;
	//private int noOfDays;
	private RoomDTO room;
	//private String status;
	private EmployeeDTO employee;	
	//private Date checkInDate;
	//private Date checkOutDate;
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="StayId")
	public int getStayId() {
		return stayId;
	}
	
	@Column(name="GuestName",length=20,nullable=false)
	public String getGuestName() {
		return guestName;
	}
	
	//@OneToMany()
	public EmployeeDTO getEmployee() {
		return employee;
	}

	@OneToOne
	@JoinColumn(name="RoomId")
	public RoomDTO getRoom() {
		return room;
	}
	
	
	public void setEmployee(EmployeeDTO employee) {
		this.employee = employee;
	}
	public void setStayId(int stayId) {
		this.stayId = stayId;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	
	public void setRoom(RoomDTO room) {
		this.room = room;
	}
	
}
*/