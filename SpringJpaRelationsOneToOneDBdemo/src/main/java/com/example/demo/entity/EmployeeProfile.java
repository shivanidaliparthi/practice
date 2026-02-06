package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="employee_profiles")
public class EmployeeProfile {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_profile_seq")
	@SequenceGenerator(
	    name = "emp_profile_seq",
	    sequenceName = "EMP_PROFILE_SEQ",
	    allocationSize = 1
	)
	private Long id;
	
	@Column(name="phone",length=15,nullable=false)
	private String phone;
	
	@Column(name="address",length=200)
	private String address;
	@JsonIgnore
	@OneToOne
	@JoinColumn(name="employee_id",nullable=false,unique=true)
	private Employee employee;
	
	public EmployeeProfile() {}
	
	public EmployeeProfile(String phone,String address) {
		this.phone=phone;
		this.address=address;
				
	}

	public Long getId() {
		return id;
	}



	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	
	
}