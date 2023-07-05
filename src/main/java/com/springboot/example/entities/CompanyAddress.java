package com.springboot.example.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="company_address_details")
public class CompanyAddress {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="company_address_id")
	private Long addressId;
	private String branchName;
	
	public CompanyAddress(){
		
	}

	public CompanyAddress(Long addressId, String branchName) {
		super();
		this.addressId = addressId;
		this.branchName = branchName;
	}

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	@Override
	public String toString() {
		return "CompanyAddress [addressId=" + addressId + ", branchName=" + branchName + "]";
	}
	
	
}
