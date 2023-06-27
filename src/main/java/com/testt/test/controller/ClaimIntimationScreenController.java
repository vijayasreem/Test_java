package com.testt.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.testt.test.model.ClaimIntimationScreen;
import com.testt.test.model.Approver;
import com.testt.test.service.ClaimIntimationScreenService;

@RestController
public class ClaimIntimationScreenController {

    @Autowired
    private ClaimIntimationScreenService claimIntimationScreenService;

    @GetMapping("/findByApprover")
    public List<ClaimIntimationScreen> findByApprover(@RequestParam Approver approver) {
        return claimIntimationScreenService.findByApprover(approver);
    }

    @GetMapping("/findBySourceOfCalculation")
    public List<ClaimIntimationScreen> findBySourceOfCalculation(@RequestParam String sourceOfCalculation) {
        return claimIntimationScreenService.findBySourceOfCalculation(sourceOfCalculation);
    }

    @GetMapping("/findByFundValue")
    public List<ClaimIntimationScreen> findByFundValue(@RequestParam String fundValue) {
        return claimIntimationScreenService.findByFundValue(fundValue);
    }

    @GetMapping("/findByAnnuityCalculation")
    public List<ClaimIntimationScreen> findByAnnuityCalculation(@RequestParam String annuityCalculation) {
        return claimIntimationScreenService.findByAnnuityCalculation(annuityCalculation);
    }

    @GetMapping("/findByUploadedDocuments")
    public List<ClaimIntimationScreen> findByUploadedDocuments(@RequestParam String uploadedDocuments) {
        return claimIntimationScreenService.findByUploadedDocuments(uploadedDocuments);
    }

    @GetMapping("/findByModeOfExit")
    public List<ClaimIntimationScreen> findByModeOfExit(@RequestParam String modeOfExit) {
        return claimIntimationScreenService.findByModeOfExit(modeOfExit);
    }
}