package com.code.custodianmaster.BussinessLayer.Custodian;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.code.custodianmaster.Model.CustodianModel;
import com.code.custodianmaster.Model.Common.ResponseModel;
import com.code.custodianmaster.Service.CustodianServiceImp;

import static com.code.custodianmaster.BussinessLayer.Common.CommonClass.createResponseModel;

@Component
public class CustodianMaster {

	@Autowired
	private CustodianServiceImp _CustodianService;
	List<CustodianModel> _list = new ArrayList<CustodianModel>();

	public ResponseModel getAllPort() {
		try {
			Iterable<CustodianModel> vesselProfileList = _CustodianService.getAllVesselProfile();
			_list = new ArrayList<CustodianModel>();
			vesselProfileList.forEach(_list::add);
            return createResponseModel(200, "Success", _list);
//			return vesselProfileList;

		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	public ResponseModel CreatePort(CustodianModel CustodianModel) {
		try {
			Date date = new Date();
			String modifiedDate = new SimpleDateFormat("yyyy-MM-dd").format(date);
			CustodianModel.setStatus("Submitted");
			CustodianModel.setCreateddate(modifiedDate);
			CustodianModel vesselProfileModel = _CustodianService.CreatePort(CustodianModel);
			if (vesselProfileModel != null) {
				return createResponseModel(200, "Success", null);
//				return ("Data added successfully");
			} else {
				return createResponseModel(500, "Error occurred", null);
//				return ("Error occurred");
			}
		} catch (Exception ex) {
	            return createResponseModel(500, ex.getMessage(), null);
		}
	}

	public ResponseModel getPortById(String Id) {
		try {
			CustodianModel portById = _CustodianService.getPortById(Integer.valueOf(Id));
			_list = new ArrayList<CustodianModel>();
			_list.add(portById);
			if(portById != null) {
				return createResponseModel(200, "Success", _list);
			}
			else {
				return createResponseModel(500, "No data available", null);
			}
		} catch (Exception ex) {
			return createResponseModel(500, ex.getMessage(), null);
		}
	}
	

//	public String deletePortById(String Id) {
//		CustodianModel portById = _CustodianService.getPortById(Integer.valueOf(Id));
//		_CustodianService.deletePortById(portById);
//		return "Data deleted Successfully";
//	}
	
	public ResponseModel deletePortById(String Id) {
		try {
			CustodianModel portById = _CustodianService.getPortById(Integer.valueOf(Id));
			if(portById != null) {
				_CustodianService.deletePortById(portById);
				return createResponseModel(200, "Success", null);
			}
			 else {
	                return createResponseModel(500, "Record not found", null);
	            }
		}catch (Exception ex) {
            return createResponseModel(500, ex.getMessage(), null);
        }
	}
	

	public ResponseModel updatePortById(String Id, CustodianModel CustodianModel) {

		try {
			CustodianModel portById = _CustodianService.getPortById(Integer.valueOf(Id));
			if (CustodianModel != null) {
				if (portById != null) {

//					Date date = new Date();
//					String modifiedDate = new SimpleDateFormat("yyyy-MM-dd").format(date);
					portById.setStatus(CustodianModel.getStatus());
					portById.setCreateddate(CustodianModel.getCreateddate());
					portById.setCustodiantype(CustodianModel.getCustodiantype());
					portById.setCustodianname(CustodianModel.getCustodianname());
					portById.setCode(CustodianModel.getCode());
					portById.setCustodianlocation(CustodianModel.getCustodianlocation());
					portById.setCodedescription(CustodianModel.getCodedescription());
					portById.setCreatedby(CustodianModel.getCreatedby());
					portById.setParentcode(CustodianModel.getParentcode());
					_CustodianService.updatePort(Integer.valueOf(Id), portById);
				}
				 return createResponseModel(200, "Success", null);
			} else {
	                return createResponseModel(500, "Record not found", null);
			}
		} catch (Exception ex) {
	            return createResponseModel(500, ex.getMessage(), null);
		}
//		return CustodianModel;
	}

}
