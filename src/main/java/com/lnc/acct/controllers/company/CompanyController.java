package com.lnc.acct.controllers.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lnc.acct.models.company.Company;
import com.lnc.acct.repositories.company.CompanyRepository;

@Controller
public class CompanyController {
	@Autowired
	CompanyRepository companyRepository;

	@RequestMapping("/")
	@ResponseBody
	public Object get() {
		Iterable<Company> companyIterable = companyRepository.findAll();
		Iterator<Company> companyIterator = companyIterable.iterator();
		List<Company> results = new ArrayList<>();
		while (companyIterator.hasNext()) {
			results.add(companyIterator.next());
		}

		return results;
	}

}
