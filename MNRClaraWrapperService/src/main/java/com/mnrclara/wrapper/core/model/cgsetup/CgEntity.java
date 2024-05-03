package com.mnrclara.wrapper.core.model.cgsetup;

import lombok.Data;

import java.util.Date;

@Data
public class CgEntity {

    private Long entityId;
    private Long clientId;
    private String companyId;
    private String languageId;
    private String entityName;
    private String clientName;
    private String companyIdAndDescription;
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
