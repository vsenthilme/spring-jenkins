package com.mnrclara.wrapper.core.model.accounting;

import java.util.List;

import lombok.Data;

@Data
public class SearchInvoiceHeader {
	/*
	 * CLASS_ID
	 * CLASS_ID
	 * MATTER_NO
	 * CLIENT_ID
	 * STATUS_ID
	 * PARTNER_ASSIGNED
	 * CTD_BY
	 */
	private List<Long> classId;
	private List<String> clientId;
	private List<String> partnerAssigned;
	private List<String> matterNumber;
	private List<String> invoiceNumber;
	private List<Long> statusId;
	private List<String> createdBy;

	// Invoice Date
	private String startInvoiceDate;
	private String endInvoiceDate;
}
