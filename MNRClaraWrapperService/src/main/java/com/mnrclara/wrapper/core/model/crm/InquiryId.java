package com.mnrclara.wrapper.core.model.crm;

import lombok.Data;
import java.util.Date;

@Data
public class InquiryId {

    private Long id;
    private Long inquiryId;
    private String fileName;
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
    private String uploadedBy;
    private String reUploadedBy;
    private Date uploadedOn;
    private Date reUploadedOn;
    private String sUploadedOn;
    private String sReUploadedOn;
}