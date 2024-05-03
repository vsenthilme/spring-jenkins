package com.mnrclara.wrapper.core.model.report;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class SearchPotentialClientReport {
	
	/*
	 * CLASS_ID
	 * REFERRAL_ID
	 * POT_CLIENT_ID
	 * INQ_NO
	 * STATUS_ID
	 * REF_FIELD_3
	 * REF_FIELD4
	 * REF_FIELD2
	 * CTD_ON
	 */
	private Long classId;
	private List<Long> referralId;	
	private List<String> potentialClientId;
	private List<String> inquiryNumber;
	private List<Long> statusId;
	private List<String> onBoardingStatusRefField3; 	// On boarding Status
	private List<String> consultingAttorneyRefField4; 	// Consulting Attorney
	private List<String> retainedByRefField2; 			// Retained by
	private Date fromCreatedOn;
	private Date toCreatedOn;

	private Date clientFromCreatedOn;                   // Start Client Create Date
	private Date clientEndCreatedOn;  				    // End Client Create Date

	private Date startProspectiveFileDate;				// Start ProspectiveFileDate
	private Date endProspectiveFileDate;				// End ProspectiveFileDate
	private List<String> followUpBy;                    // ReferenceField4
}
