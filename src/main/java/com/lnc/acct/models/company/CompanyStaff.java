package com.lnc.acct.models.company;

import java.math.BigInteger;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.lnc.acct.models.User;

@Entity
@Table(name = "company_staff")
public class CompanyStaff {
	@Id
	BigInteger id;

	@ManyToOne
	@JoinColumn(name = "companyId")
	Company company;

	@OneToOne
	@JoinColumn(name = "userId")
	@NotFound(action = NotFoundAction.IGNORE)
	User user;

	@ManyToOne
	@JoinColumn(name = "departmentId")
	@NotFound(action = NotFoundAction.IGNORE)
	CompanyDepartment department;

	@OneToOne
	@JoinColumn(name = "positionId")
	@NotFound(action = NotFoundAction.IGNORE)
	CompanyPosition position;

	@ManyToOne
	@JoinColumn(name = "branchId")
	@NotFound(action = NotFoundAction.IGNORE)
	CompanyBranch branch;

	Calendar startWorkingDate;
	Calendar stopWorkingDate;

	int status;
	String workphone;
	String workemail;
	String description;

	@ManyToOne
	@JoinColumn(name = "bossId")
	@NotFound(action = NotFoundAction.IGNORE)
	CompanyStaff boss;
	
	String major;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public CompanyDepartment getDepartment() {
		return department;
	}

	public void setDepartment(CompanyDepartment department) {
		this.department = department;
	}

	public CompanyPosition getPosition() {
		return position;
	}

	public void setPosition(CompanyPosition position) {
		this.position = position;
	}

	public CompanyBranch getBranch() {
		return branch;
	}

	public void setBranch(CompanyBranch branch) {
		this.branch = branch;
	}

	public Calendar getStartWorkingDate() {
		return startWorkingDate;
	}

	public void setStartWorkingDate(Calendar startWorkingDate) {
		this.startWorkingDate = startWorkingDate;
	}

	public Calendar getStopWorkingDate() {
		return stopWorkingDate;
	}

	public void setStopWorkingDate(Calendar stopWorkingDate) {
		this.stopWorkingDate = stopWorkingDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getWorkphone() {
		return workphone;
	}

	public void setWorkphone(String workphone) {
		this.workphone = workphone;
	}

	public String getWorkemail() {
		return workemail;
	}

	public void setWorkemail(String workemail) {
		this.workemail = workemail;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public CompanyStaff getBoss() {
		return boss;
	}

	public void setBoss(CompanyStaff boss) {
		this.boss = boss;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
}
