package com.mnrclara.wrapper.core.model.accounting;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class AddQuotationLine {
	private String quotationNo;
	private Long quotationRevisionNo;
	private Long serialNumber;
	private String languageId;
	private Long classId;
	private String matterNumber;
	private String clientId;
	private Long itemNumber;
	private String itemDescription;
	private String timekeeperCode;
	private Double rateperHour;
	private Double quantity;
	private Double totalAmount;
	private String currency;
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
}
