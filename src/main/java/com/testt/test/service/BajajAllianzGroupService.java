package com.testt.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testt.test.model.BajajAllianzGroup;
import com.testt.test.repository.BajajAllianzGroupRepository;

@Service
public class BajajAllianzGroupService {

@Autowired
private BajajAllianzGroupRepository bajajAllianzGroupRepository;

public double getSumAssured(int age){
  return bajajAllianzGroupRepository.getSumAssured(age);
}

public int getPolicyTenure(){
  return bajajAllianzGroupRepository.getPolicyTenure();
}

public BajajAllianzGroup getEligibility(boolean isEligible, boolean isOTPAuthenticated){
  return bajajAllianzGroupRepository.getEligibility(isEligible, isOTPAuthenticated);
}

}