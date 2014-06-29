package com.lnc.acct.models.address;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ward")
public class Ward {
	String id;
	String name;
	String type;
	String location;

	@ManyToOne
	@JoinColumn(name = "disctrictId")
	District district;
}
