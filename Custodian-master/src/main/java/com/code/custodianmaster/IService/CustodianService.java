package com.code.custodianmaster.IService;

import org.springframework.stereotype.Service;

import com.code.custodianmaster.Model.CustodianModel;

@Service
public interface CustodianService {

	Iterable<CustodianModel> getAllVesselProfile();
	
	CustodianModel CreatePort(CustodianModel CustodianModel);
	
	CustodianModel getPortById(Integer Id);
	
	CustodianModel updatePort(Integer Id, CustodianModel CustodianModel);

    Void deletePortById(CustodianModel CustodianModel);

}
