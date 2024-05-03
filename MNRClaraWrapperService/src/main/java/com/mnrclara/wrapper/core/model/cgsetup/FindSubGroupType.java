package com.mnrclara.wrapper.core.model.cgsetup;


import lombok.Data;

import java.util.List;

@Data
public class FindSubGroupType {

    private List<String> companyId;
    private List<String> languageId;
    private List<Long> groupTypeId;
    private List<Long> subGroupTypeId;
    private List<Long> versionNumber;
    private List<Long> statusId;
    private String startCreatedOn;
    private String endCreatedOn;
}
