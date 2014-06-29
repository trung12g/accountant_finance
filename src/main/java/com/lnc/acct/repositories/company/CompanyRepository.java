package com.lnc.acct.repositories.company;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import com.lnc.acct.models.company.Company;

public interface CompanyRepository extends CrudRepository<Company, BigInteger>{

}
