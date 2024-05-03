package com.mnrclara.wrapper.core.model.crm.itform;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public abstract class BaseITForm {
	
	@JsonIgnore
	@Id
    private String id;
    
    private String inquiryNo;
    private Long classID;
	private String language;
    private String itFormNo;
	private Long itFormID;
	
	public String getId () {
		this.id = inquiryNo + ":" + classID + ":" + language + ":" + itFormNo + ":" + itFormID;
		return this.id;
	}
}