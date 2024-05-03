package com.mnrclara.wrapper.core.model.accounting;

import java.util.Date;

import lombok.Data;

@Data
public class PaymentDetails {

	private Date postingDate;	// POSTING_DATE
	private String description;	// PAYMENT_TEXT
	private Double amount;		// PAYMENT_AMT
	private Date startDateForPreBill;
	private Date paymentCutoffDate;
	private Date feesCutoffDate;
}
