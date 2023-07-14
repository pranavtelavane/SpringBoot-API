package com.code.custodianmaster.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CUSTODIAN_MASTER")
public class CustodianModel {
	
	 public CustodianModel(int custodianid, String custodiantype, String custodianname, String code,
			String codedescription, String custodianlocation, String status, String createdby, String createddate,
			String parentcode) {
		super();
		this.custodianid = custodianid;
		this.custodiantype = custodiantype;
		this.custodianname = custodianname;
		this.code = code;
		this.codedescription = codedescription;
		this.custodianlocation = custodianlocation;
		this.status = status;
		this.createdby = createdby;
		this.createddate = createddate;
		this.parentcode = parentcode;
	}

	public CustodianModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @JsonProperty("custodianid")
	    private int custodianid;

	    @JsonProperty("custodiantype")
	    private String custodiantype;
	    
		@JsonProperty("custodianname")
	    private String custodianname;

	    @JsonProperty("code")
	    private String code;
	    
	    @JsonProperty("codedescription")
	    private String codedescription;

	    @JsonProperty("custodianlocation")
	    private String custodianlocation;

	    @JsonProperty("status")
	    private  String status;

	    @JsonProperty("createdby")
	    private  String createdby;
	    
	    @JsonProperty("createddate")
	    private  String createddate;
	    
	    @JsonProperty("parentcode")
	    private  String parentcode;

		public int getCustodianid() {
			return custodianid;
		}

		public void setCustodianid(int custodianid) {
			this.custodianid = custodianid;
		}

		public String getCustodiantype() {
			return custodiantype;
		}

		public void setCustodiantype(String custodiantype) {
			this.custodiantype = custodiantype;
		}

		public String getCustodianname() {
			return custodianname;
		}

		public void setCustodianname(String custodianname) {
			this.custodianname = custodianname;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getCodedescription() {
			return codedescription;
		}

		public void setCodedescription(String codedescription) {
			this.codedescription = codedescription;
		}

		public String getCustodianlocation() {
			return custodianlocation;
		}

		public void setCustodianlocation(String custodianlocation) {
			this.custodianlocation = custodianlocation;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreatedby() {
			return createdby;
		}

		public void setCreatedby(String createdby) {
			this.createdby = createdby;
		}

		public String getCreateddate() {
			return createddate;
		}

		public void setCreateddate(String createddate) {
			this.createddate = createddate;
		}

		public String getParentcode() {
			return parentcode;
		}

		public void setParentcode(String parentcode) {
			this.parentcode = parentcode;
		}

}
