package com.lnc.acct.models.company;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.lnc.acct.models.address.District;
import com.lnc.acct.models.address.Province;
import com.lnc.acct.models.address.Ward;

@Entity
@Table(name = "company_branch")
public class CompanyBranch {
	@Id
	BigInteger id;

	@ManyToOne
	@JoinColumn(name = "companyId")
	Company company;

	String name;
	String street;
	@OneToOne
	@JoinColumn(name = "provinceId")
	Province province;

	@OneToOne
	@JoinColumn(name = "wardId")
	Ward ward;

	@OneToOne
	@JoinColumn(name = "distId")
	District district;

	String phone;
	String fax;
	int status;
	String description;

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

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	public Ward getWard() {
		return ward;
	}

	public void setWard(Ward ward) {
		this.ward = ward;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
