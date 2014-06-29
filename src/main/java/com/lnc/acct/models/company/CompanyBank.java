package com.lnc.acct.models.company;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "company_bank")
public class CompanyBank {
	@Id
	BigInteger id;

	@ManyToOne
	@JoinColumn(name = "companyId")
	Company company;

	@OneToOne
	@JoinColumn(name = "bankId")
	Company bank;

	@OneToOne
	@JoinColumn(name = "branchId")
	CompanyBranch bankBranch;

	String name;
	String code;

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

	public Company getBank() {
		return bank;
	}

	public void setBank(Company bank) {
		this.bank = bank;
	}

	public CompanyBranch getBankBranch() {
		return bankBranch;
	}

	public void setBankBranch(CompanyBranch bankBranch) {
		this.bankBranch = bankBranch;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
