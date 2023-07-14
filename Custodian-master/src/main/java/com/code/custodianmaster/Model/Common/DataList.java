package com.code.custodianmaster.Model.Common;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataList<T> {
	
	 @JsonProperty("DATA")
	    private List<T> DATA = new ArrayList<T>();

	    public DataList() {
	    }

	    @JsonProperty("DATA")
	    public List<T> getDATA() {
	        return DATA;
	    }

	    @JsonProperty("DATA")
	    public void setDATA(List<T> DATA) {
	        this.DATA = DATA;
	    }

}
