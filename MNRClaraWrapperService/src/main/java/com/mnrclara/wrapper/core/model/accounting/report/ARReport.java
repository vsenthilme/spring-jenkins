package com.mnrclara.wrapper.core.model.accounting.report;

import lombok.Data;

import java.util.Date;

@Data
public class ARReport {
	String classId;
	String clientId;
	String clientName;
	String matterNumber;
	String matterText;
	String billingFormat;
	String phone;
	Double feesDue;
	Double hardCostsDue;
	Double softCostsDue;
	Double totalDue;
	Date lastBillDate;
	Date lastPaymentDate;

	private String partner;
	private String originatingTimeKeeper;
	private String responsibleTimeKeeper;
	private String assignedTimeKeeper;
	private String legalAssistant;
	private String paralegal;
	private String lawClerk;
}
