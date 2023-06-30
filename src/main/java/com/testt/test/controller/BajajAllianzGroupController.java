package com.testt.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.testt.test.model.BajajAllianzGroup;
import com.testt.test.service.BajajAllianzGroupService;

@RestController
public class BajajAllianzGroupController {

@Autowired
private BajajAllianzGroupService bajajAllianzGroupService;

@GetMapping("/sumAssured/{age}")
public double getSumAssured(@PathVariable int age){
  return bajajAllianzGroupService.getSumAssured(age);
}

@GetMapping("/policyTenure")
public int getPolicyTenure(){
  return bajajAllianzGroupService.getPolicyTenure();
}

@GetMapping("/eligibility")
public BajajAllianzGroup getEligibility(@RequestParam boolean isEligible,
@RequestParam boolean isOTPAuthenticated){
  return bajajAllianzGroupService.getEligibility(isEligible, isOTPAuthenticated);
}

}