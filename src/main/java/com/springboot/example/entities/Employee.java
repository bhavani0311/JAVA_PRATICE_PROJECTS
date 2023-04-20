package com.springboot.example.entities;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//id, name, email, phone, created_by, created_on
@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long eid;
	private String ename;
	private String email;
	private int phone;
	private String createdBy;
	private String createdOn;
	
	Employee(){
		
	}

	public Employee(Long eid, String ename, String email, int phone, String createdBy, String createdOn) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.email = email;
		this.phone = phone;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
	}

	public Long getEid() {
		return eid;
	}

	public void setEid(Long eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", email=" + email + ", phone=" + phone + ", createdBy="
				+ createdBy + ", createdOn=" + createdOn + "]";
	}
	
	

}
