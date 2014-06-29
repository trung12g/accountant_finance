package com.lnc.acct.models.company;

import java.math.BigInteger;

import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class CompanyInvoices {
	@Id
	BigInteger id;

	@ManyToOne
	@JoinColumn(name = "companyId")
	Company company;
	String name;

	@Enumerated
	CompanyInvoiceType type;

	int status;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CompanyInvoiceType getType() {
		return type;
	}

	public void setType(CompanyInvoiceType type) {
		this.type = type;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
