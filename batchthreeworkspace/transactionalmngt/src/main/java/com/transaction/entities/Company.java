package com.transaction.entities;


import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class Company {

	@Id
	@Column(name = "company_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int companyNo;
	@Column(name = "business_nm")
	protected String businessName;
	@Column(name = "established_dt")
	protected Date establishedDate;
	@Column(name = "contact_no")
	protected String contactNo;
	@Column(name = "email_address")
	protected String emailAddress;
	@Column(name = "hr_representative_nm")
	protected String hrRepresentativeName;
	@OneToMany
	@JoinColumn(name = "company_no")
	protected Set<Job> jobs;

	public int getCompanyNo() {
		return companyNo;
	}

	public void setCompanyNo(int companyNo) {
		this.companyNo = companyNo;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public Date getEstablishedDate() {
		return establishedDate;
	}

	public void setEstablishedDate(Date establishedDate) {
		this.establishedDate = establishedDate;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getHrRepresentativeName() {
		return hrRepresentativeName;
	}

	public void setHrRepresentativeName(String hrRepresentativeName) {
		this.hrRepresentativeName = hrRepresentativeName;
	}

	public Set<Job> getJobs() {
		return jobs;
	}

	public void setJobs(Set<Job> jobs) {
		this.jobs = jobs;
	}
	
	
}
