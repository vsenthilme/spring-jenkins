package com.mnrclara.wrapper.core.model.management;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class MatterFeeSharing { 
	
	private String timeKeeperCode;
	private String languageId;
	private Long classId;
	private String matterNumber;
	private String clientId;	
	private Long caseCategoryId;
	private Long caseSubCategoryId;
	private Double feeSharingPercentage;
	private Long statusId;
	private Long deletionIndicator;
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
    private Date createdOn;
    private String updatedBy;
	private Date updatedOn;
}
