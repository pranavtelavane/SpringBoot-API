package com.code.custodianmaster.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.code.custodianmaster.BussinessLayer.Custodian.CustodianMaster;
import com.code.custodianmaster.Model.CustodianModel;
import com.code.custodianmaster.Model.Common.ResponseModel;

@RestController
@RequestMapping("/code")
public class CustodianMasterController {

	@Autowired
	private CustodianMaster _CustodianMaster;

	@GetMapping("/getAllCustodian")
	public ResponseModel getAllVesselProfile() {
		return _CustodianMaster.getAllPort();
	}

	@PostMapping("/addcode")
	public ResponseModel createPort(@RequestBody CustodianModel CustodianModel) {
		return _CustodianMaster.CreatePort(CustodianModel);
	}

	@GetMapping("/getCustodianById")
	public ResponseModel getPortById(@RequestParam(value = "id", required = false) String id) {
		return _CustodianMaster.getPortById(id);
	}

	@DeleteMapping("/deleteCustodianById")
	public ResponseModel deletePortById(@RequestParam(value = "id", required = false) String id) {
		return _CustodianMaster.deletePortById(id);
	}

	@PutMapping("/updateCustodianById")
	public ResponseModel updatePortById(@RequestParam(value = "id", required = false) String id,
			@RequestBody CustodianModel CustodianModel) {
		ResponseModel model = _CustodianMaster.updatePortById(id, CustodianModel);
		return model;
	}

}
