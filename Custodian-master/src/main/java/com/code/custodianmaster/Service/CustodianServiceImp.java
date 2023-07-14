package com.code.custodianmaster.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.code.custodianmaster.IService.CustodianService;
import com.code.custodianmaster.Model.CustodianModel;
import com.code.custodianmaster.Repository.CustodianMasterRepository;

@Component
public class CustodianServiceImp implements CustodianService{
	
	@Autowired
	private CustodianMasterRepository _CustodianMasterRepository;
	
	
	
	 @Override
	    public Iterable<CustodianModel> getAllVesselProfile() {
	        return _CustodianMasterRepository.findAll();
	    }
	 
	    @Override
	    public CustodianModel CreatePort(CustodianModel CustodianModel) {
	        return _CustodianMasterRepository.save(CustodianModel);
	    }
	    
	    @Override
	    public CustodianModel getPortById(Integer Id) {
	    	CustodianModel CustodianModel = _CustodianMasterRepository.findById(Id).orElse(null);
	        return CustodianModel;
	    }
	    
	    @Override
	    public CustodianModel updatePort(Integer Id, CustodianModel CustodianModel) {
	    	CustodianModel save = _CustodianMasterRepository.save(CustodianModel);
	        return save;
	    }


	    @Override
	    public Void deletePortById(CustodianModel CustodianModel) {
	    	_CustodianMasterRepository.delete(CustodianModel);
	        return null;
	    }

}
