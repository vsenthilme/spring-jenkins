package com.mnrclara.wrapper.core.model.cgtransaction;

import lombok.Data;

import java.util.List;

@Data
public class ExactMatchResult {

    private String coOwnerName;
    private List<StoreInfo> store;
}
