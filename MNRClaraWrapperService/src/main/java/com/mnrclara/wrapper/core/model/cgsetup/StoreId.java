package com.mnrclara.wrapper.core.model.cgsetup;

import lombok.Data;

import java.util.Date;

@Data
public class StoreId {

    private String companyId;

    private String languageId;

    private Long storeId;

    private String storeName;

    private String phoneNo;

    private String address;

    private String city;

    private String state;

    private String country;

    private Long status;

    private Long groupTypeId;

    private Long subGroupTypeId;

    private String groupTypeName;

    private String subGroupTypeName;

    private Long deletionIndicator;

    private String companyIdAndDescription;

    private String cityIdAndDescription;

    private String countryIdAndDescription;

    private String stateIdAndDescription;

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

    private String updatedBy;

    private Date updatedOn = new Date();


}

