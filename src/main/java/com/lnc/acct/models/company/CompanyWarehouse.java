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
@Table(name = "company_warehouse")
public class CompanyWarehouse {
	@Id
	BigInteger id;

	@ManyToOne
	@JoinColumn(name = "companyId")
	Company company;

	@ManyToOne
	@JoinColumn(name = "managerId")
	CompanyStaff manager;

	String stree;

	@OneToOne
	@JoinColumn(name = "provinceId")
	Province province;

	@OneToOne
	@JoinColumn(name = "wardId")
	Ward ward;

	@OneToOne
	@JoinColumn(name = "distId")
	District district;

	boolean isTemp;
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

	public CompanyStaff getManager() {
		return manager;
	}

	public void setManager(CompanyStaff manager) {
		this.manager = manager;
	}

	public String getStree() {
		return stree;
	}

	public void setStree(String stree) {
		this.stree = stree;
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

	public boolean isTemp() {
		return isTemp;
	}

	public void setTemp(boolean isTemp) {
		this.isTemp = isTemp;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
