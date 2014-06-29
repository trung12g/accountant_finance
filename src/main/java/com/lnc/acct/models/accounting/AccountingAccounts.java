package com.lnc.acct.models.accounting;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.lnc.acct.models.AccountingAccountType;

@Entity
@Table(name = "accounting_accounts")
public class AccountingAccounts {
	@Id
	BigInteger id;

	String code;
	String name_en;
	String name_vn;

	int level;

	BigInteger parent;

	@Enumerated
	AccountingAccountType type;

	@OneToMany(mappedBy = "parent", fetch = FetchType.LAZY)
	@OrderBy("id")
	@NotFound(action = NotFoundAction.IGNORE)
	List<AccountingAccounts> childrens;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName_en() {
		return name_en;
	}

	public void setName_en(String name_en) {
		this.name_en = name_en;
	}

	public String getName_vn() {
		return name_vn;
	}

	public void setName_vn(String name_vn) {
		this.name_vn = name_vn;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public BigInteger getParent() {
		return parent;
	}

	public void setParent(BigInteger parent) {
		this.parent = parent;
	}

	public AccountingAccountType getType() {
		return type;
	}

	public void setType(AccountingAccountType type) {
		this.type = type;
	}

	public List<AccountingAccounts> getChildrens() {
		return childrens;
	}

	public void setChildrens(List<AccountingAccounts> childrens) {
		this.childrens = childrens;
	}
}
