package com.lnc.acct.models.company;

import java.math.BigInteger;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class Company {
	@Id
	@GeneratedValue
	BigInteger id;

	String website;
	Calendar startWorkingDate;

	@OneToOne
	@JoinColumn(name="typeId")
	CompanyType type;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Calendar getStartWorkingDate() {
		return startWorkingDate;
	}

	public void setStartWorkingDate(Calendar startWorkingDate) {
		this.startWorkingDate = startWorkingDate;
	}

	public CompanyType getType() {
		return type;
	}

	public void setType(CompanyType type) {
		this.type = type;
	}
}
