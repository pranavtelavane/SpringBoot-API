package com.code.custodianmaster.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.code.custodianmaster.Model.CustodianModel;


@Repository
public interface CustodianMasterRepository extends CrudRepository<CustodianModel, Integer>{

}
