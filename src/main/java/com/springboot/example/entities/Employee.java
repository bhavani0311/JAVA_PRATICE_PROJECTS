package com.springboot.example.entities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
/*@Transactional
@Data
@NoArgsConstructor*/
@Table(name="employee_details")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="emp_id")
	private Long empId;
	private String empName;
	private Integer empAge;
	//Employee has only 1 permanent address
	@OneToOne(fetch = FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(name="fk_address_id")
	private Address address;
	//1 company has many branches
	@OneToMany(fetch = FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(name="fk_emp_id", referencedColumnName="emp_id")
	private List<CompanyAddress> companyAddress;
	
	//employee works in many companies
	@ManyToMany
	@JoinTable(name="employee_company",
	joinColumns = @JoinColumn(name="emp_id"),
	inverseJoinColumns=@JoinColumn(name="company_id"))
	private Set<Company> companies = new HashSet<>();
	
	public Employee() {
		
	}

	public Employee(Long empId, String empName, Integer empAge, Address address, List<CompanyAddress> companyAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.address = address;
		this.companyAddress = companyAddress;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getEmpAge() {
		return empAge;
	}

	public void setEmpAge(Integer empAge) {
		this.empAge = empAge;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<CompanyAddress> getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(List<CompanyAddress> companyAddress) {
		this.companyAddress = companyAddress;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", address=" + address
				+ ", companyAddress=" + companyAddress + "]";
	}

	
	
	
	
	
}
