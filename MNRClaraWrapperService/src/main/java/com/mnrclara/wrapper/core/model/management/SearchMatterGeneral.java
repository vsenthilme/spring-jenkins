package com.mnrclara.wrapper.core.model.management;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class SearchMatterGeneral {

	/*
	 * Multisearch
	 * ------------
	 * MATTER_NO
	 * CASEINFO_NO
	 * CASE_CATEGORY
	 * STATUS_ID/STATUS_TEXT
	 */
	 private List<String> matterNumber;
	 private List<String> caseInformationNo;
	 private List<Long> caseCategoryId; 
	 private List<Long> statusId;
	 private List<Long> classId;
	 private String matterDescription; 
	 private List<String> clientId;
	 private Date caseOpenedDate1;
	 private Date caseOpenedDate2;
}
