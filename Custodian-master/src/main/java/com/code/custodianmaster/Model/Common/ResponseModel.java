package com.code.custodianmaster.Model.Common;

import com.fasterxml.jackson.annotation.JsonProperty;



public class ResponseModel {
	
	 @JsonProperty("RESPONSE_CODE")
	    private Integer RESPONSE_CODE;
	    @JsonProperty("RESPONSE_MESSAGE")
	    private String RESPONSE_MESSAGE;
	    @JsonProperty("RESPONSE_MESSAGE_DETAILS")
	    private DataList RESPONSE_MESSAGE_DETAILS;
	    
	    
	    
	    public ResponseModel(Integer RESPONSE_CODE, String RESPONSE_MESSAGE, DataList RESPONSE_MESSAGE_DETAILS) {
	        this.RESPONSE_CODE = RESPONSE_CODE;
	        this.RESPONSE_MESSAGE = RESPONSE_MESSAGE;
	        this.RESPONSE_MESSAGE_DETAILS = RESPONSE_MESSAGE_DETAILS;
	    }
	    
	    
	    public ResponseModel() {
	    	
		}


		@JsonProperty("RESPONSE_CODE")
	    public Integer getRESPONSE_CODE() {
	        return RESPONSE_CODE;
	    }

	    @JsonProperty("RESPONSE_CODE")
	    public void setRESPONSE_CODE(Integer RESPONSE_CODE) {
	        this.RESPONSE_CODE = RESPONSE_CODE;
	    }

	    @JsonProperty("RESPONSE_MESSAGE")
	    public String getRESPONSE_MESSAGE() {
	        return RESPONSE_MESSAGE;
	    }

	    @JsonProperty("RESPONSE_MESSAGE")
	    public void setRESPONSE_MESSAGE(String RESPONSE_MESSAGE) {
	        this.RESPONSE_MESSAGE = RESPONSE_MESSAGE;
	    }

	    @JsonProperty("RESPONSE_MESSAGE_DETAILS")
	    public DataList getRESPONSE_MESSAGE_DETAILS() {
	        return RESPONSE_MESSAGE_DETAILS;
	    }

	    @JsonProperty("RESPONSE_MESSAGE_DETAILS")
	    public void setRESPONSE_MESSAGE_DETAILS(DataList RESPONSE_MESSAGE_DETAILS) {
	        this.RESPONSE_MESSAGE_DETAILS = RESPONSE_MESSAGE_DETAILS;
	    }

}
