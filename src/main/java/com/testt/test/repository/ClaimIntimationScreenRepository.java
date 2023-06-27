package com.testt.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.testt.test.model.ClaimIntimationScreen;

public interface ClaimIntimationScreenRepository extends JpaRepository<ClaimIntimationScreen, Long> {
    List<ClaimIntimationScreen> findByApprover(Approver approver);
    List<ClaimIntimationScreen> findBySourceOfCalculation(String sourceOfCalculation);
    List<ClaimIntimationScreen> findByFundValue(String fundValue);
    List<ClaimIntimationScreen> findByAnnuityCalculation(String annuityCalculation);
    List<ClaimIntimationScreen> findByUploadedDocuments(String uploadedDocuments);
    List<ClaimIntimationScreen> findByModeOfExit(String modeOfExit);
}