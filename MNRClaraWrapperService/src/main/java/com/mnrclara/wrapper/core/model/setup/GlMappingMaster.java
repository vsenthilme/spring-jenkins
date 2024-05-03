package com.mnrclara.wrapper.core.model.setup;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class GlMappingMaster { 
	
	private String languageId;
	
	private Long itemNumber;
	
	private String itemDescription;
	
	private String glAccount;
	
	private String glDescription;
	
	private String glAccountType;
	
	private Long status;
	
	private String referenceField1;
	
	private String referenceField2;
	
	private String referenceField3;
	
	private String referenceField4;
	
	private String referenceField5;
	
	private String referenceField6;
	
	private String referenceField7;
	
	private String referenceField8;
	
	private String referenceField9;
	
	private String referenceField10;
	
	private String createdBy;
	
	private Date createdOn = new Date();
	
	private String updatedBy;
	
	private Date updatedOn = new Date();
}
