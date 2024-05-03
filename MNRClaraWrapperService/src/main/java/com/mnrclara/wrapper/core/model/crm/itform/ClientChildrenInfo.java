package com.mnrclara.wrapper.core.model.crm.itform;


import java.util.Date;

import lombok.Data;

@Data
public class ClientChildrenInfo {

	private String nameOfChild;
	private Date dateOfBirth;
	private String cityAndCountryOfBirth;
	private int age;
	private boolean doesChildLiveWithYou;
	
}
