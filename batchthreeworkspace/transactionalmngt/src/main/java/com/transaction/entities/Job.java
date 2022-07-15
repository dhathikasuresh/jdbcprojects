package com.transaction.entities;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.PositiveOrZero;

import com.sun.istack.NotNull;





@Entity
@Table(name = "job")
public class Job{
	
	@Id
	@Column(name = "job_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int jobNo;
	protected String title;
	protected String description;
	@Column(name = "opened_dt")
	protected Date openedDate;
	@Column(name = "close_dt")
	protected Date closeDate;
	protected String designation;
	@Min(value = 0L, message = "The value must be positive")
	protected double experience;
	public int getJobNo() {
		return jobNo;
	}
	public void setJobNo(int jobNo) {
		this.jobNo = jobNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getOpenedDate() {
		return openedDate;
	}
	public void setOpenedDate(Date openedDate) {
		this.openedDate = openedDate;
	}
	public Date getCloseDate() {
		return closeDate;
	}
	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}

}
