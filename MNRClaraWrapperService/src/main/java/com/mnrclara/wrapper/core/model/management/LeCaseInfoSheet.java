package com.mnrclara.wrapper.core.model.management;

import java.util.Date;

import lombok.Data;

@Data
public class LeCaseInfoSheet extends BaseCaseInfoSheet {
	private String languageId;
	private Long classId;
//	private String caseInformationId;
	private String clientId;
	private String potentialClientId;
	private Long transactionId;
	private String inquiryNumber;
	private Long caseCategoryId;
	private Long caseSubCategoryId;
	private String matterNumber;
	private String intakeFormNumber;
	private Long intakeFormId;
	private String typeOfMatter;
	private String matterDescription;
	private String causeNo;
	private String plaintiffs;
	private String defendants;
	private String reference;
	private String locationOfFile;
	private String firstNameLastName;
	private String title;
	private String emailId;
	private String companyName;
	private String adressLine1;
	private String adressLine2;
	private String city;
	private String state;
	private String country;
	private String zipCode;
	private String contactNumber;
	private String workNo;
	private String homeNo;
	private String fax;
	private String advParty1Name;
	private String advParty1Email;
	private String advParty1CompanyName;
	private String advParty1StreetAddress;
	private String advParty1City;
	private String advParty1State;
	private String advParty1PostalZipCode;
	private String advParty1OfficeTelephone;
	private String advParty1DirectTelephone;
	private String advParty1CellPhone;
	private String advParty1FaxNumber;
	private String advParty2Name;
	private String advParty2Email;
	private String advParty2CompanyName;
	private String advParty2StreetAddress;
	private String advParty2City;
	private String advParty2State;
	private String advParty2PostalZipCode;
	private String advParty2OfficeTelephone;
	private String advParty2DirectTelephone;
	private String advParty2CellPhone;
	private String advParty2FaxNumber;
	private String judgeName;
	private String courtNo;
	private String email;
	private String streetAddress;
	private String courtCity;
	private String courtState;
	private String postalZipCode;
	private String officeTelephone;
	private String faxNumber;
	private String clerkName;
	private String clerkTelephone;
	private String clerkEmail;
	private String assistantClerkName;
	private String assistantClerkTelephone;
	private String assistantClerkEmail;
	private String sectionCoorinatorName;
	private String sectionCoorinatorTelephone;
	private String sectionCoorinatorEmail;
	private String baliffCourtReporterName;
	private String baliffCourtReporterTelephone;
	private String baliffCourtReporterEmail;
	private String agencyName;
	private String agentName;
	private String agentEmail;
	private String agrentStreetAddress;
	private String agrentCity;
	private String agentState;
	private String agentPostalZipCode;
	private String agentOfficeTelephone;
	private String directTelephone;
	private String agentFaxNumber;
	private String schedule;
	private Date scheduleDate;
	private String tasksToDo;
	private Date taskDate;
	private String notes;
	private Date notesDate;
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
	private Date createdOn = new Date();
	private String UpdatedBy;
	private Date updatedOn = new Date();
}
