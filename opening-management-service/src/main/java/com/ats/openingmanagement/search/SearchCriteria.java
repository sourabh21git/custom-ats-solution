package com.ats.openingmanagement.search;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SearchCriteria {
	private String key;
	private String operation;
	private Object value;
}
