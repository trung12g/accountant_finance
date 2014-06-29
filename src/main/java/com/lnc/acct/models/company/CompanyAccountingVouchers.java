package com.lnc.acct.models.company;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.lnc.acct.models.accounting.AccountingAccounts;

@Entity
@Table(name = "company_accounting_vouchers")
public class CompanyAccountingVouchers {
	@Id
	BigInteger id;

	@ManyToOne
	@JoinColumn(name = "companyId")
	Company company;

	String code;
	String name;

	@OneToOne
	@JoinColumn(name = "debitAccountId")
	AccountingAccounts debit;

	@OneToOne
	@JoinColumn(name = "creditAccountId")
	AccountingAccounts credit;

	BigInteger staffId;

	@ManyToOne
	@JoinColumn(name = "warehouseId")
	CompanyWarehouse warehouse;

	@ManyToOne
	@JoinColumn(name = "bankId")
	Company bank;

	@ManyToOne
	@JoinColumn(name = "invoiceId")
	CompanyInvoices invoice;

	String description;
	String invoiceDescription;
	String accountingEntryDescription;

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AccountingAccounts getDebit() {
		return debit;
	}

	public void setDebit(AccountingAccounts debit) {
		this.debit = debit;
	}

	public AccountingAccounts getCredit() {
		return credit;
	}

	public void setCredit(AccountingAccounts credit) {
		this.credit = credit;
	}

	public BigInteger getStaffId() {
		return staffId;
	}

	public void setStaffId(BigInteger staffId) {
		this.staffId = staffId;
	}

	public CompanyWarehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(CompanyWarehouse warehouse) {
		this.warehouse = warehouse;
	}

	public Company getBank() {
		return bank;
	}

	public void setBank(Company bank) {
		this.bank = bank;
	}

	public CompanyInvoices getInvoice() {
		return invoice;
	}

	public void setInvoice(CompanyInvoices invoice) {
		this.invoice = invoice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getInvoiceDescription() {
		return invoiceDescription;
	}

	public void setInvoiceDescription(String invoiceDescription) {
		this.invoiceDescription = invoiceDescription;
	}

	public String getAccountingEntryDescription() {
		return accountingEntryDescription;
	}

	public void setAccountingEntryDescription(String accountingEntryDescription) {
		this.accountingEntryDescription = accountingEntryDescription;
	}

}
