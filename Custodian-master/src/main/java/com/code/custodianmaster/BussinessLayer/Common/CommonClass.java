package com.code.custodianmaster.BussinessLayer.Common;

import java.util.List;

import com.code.custodianmaster.Model.CustodianModel;
import com.code.custodianmaster.Model.Common.DataList;
import com.code.custodianmaster.Model.Common.ResponseModel;



public class CommonClass {
	
	
	  public static ResponseModel createResponseModel(Integer responseCode, String responseMessage, List list) {
	        ResponseModel response = new ResponseModel();
	        DataList<CustodianModel> dataList = new DataList<CustodianModel>();
	        dataList.setDATA(list);
	        response.setRESPONSE_CODE(responseCode);
	        response.setRESPONSE_MESSAGE(responseMessage);
	        response.setRESPONSE_MESSAGE_DETAILS(dataList);
	        return response;
	    }

}
