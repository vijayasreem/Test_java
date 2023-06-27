package com.testt.test.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.testt.test.model.ClaimIntimationScreen;
import com.testt.test.model.Approver;
import com.testt.test.repository.ClaimIntimationScreenRepository;

@Service
public class ClaimIntimationScreenService {

    @Autowired
    private ClaimIntimationScreenRepository claimIntimationScreenRepository;

    public List<ClaimIntimationScreen> findByApprover(Approver approver) {
        return claimIntimationScreenRepository.findByApprover(approver);
    }

    public List<ClaimIntimationScreen> findBySourceOfCalculation(String sourceOfCalculation) {
        return claimIntimationScreenRepository.findBySourceOfCalculation(sourceOfCalculation);
    }

    public List<ClaimIntimationScreen> findByFundValue(String fundValue) {
        return claimIntimationScreenRepository.findByFundValue(fundValue);
    }

    public List<ClaimIntimationScreen> findByAnnuityCalculation(String annuityCalculation) {
        return claimIntimationScreenRepository.findByAnnuityCalculation(annuityCalculation);
    }

    public List<ClaimIntimationScreen> findByUploadedDocuments(String uploadedDocuments) {
        return claimIntimationScreenRepository.findByUploadedDocuments(uploadedDocuments);
    }

    public List<ClaimIntimationScreen> findByModeOfExit(String modeOfExit) {
        return claimIntimationScreenRepository.findByModeOfExit(modeOfExit);
    }
}