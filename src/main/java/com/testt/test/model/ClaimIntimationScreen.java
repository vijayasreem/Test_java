package com.testt.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ClaimIntimationScreen {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    private Approver approver;
    private String sourceOfCalculation;
    private String fundValue;
    private String annuityCalculation;
    private String uploadedDocuments;
    private String modeOfExit;
 
    public ClaimIntimationScreen() {}
 
    public ClaimIntimationScreen(Approver approver, String sourceOfCalculation,
            String fundValue, String annuityCalculation, String uploadedDocuments,
            String modeOfExit) {
        this.approver = approver;
        this.sourceOfCalculation = sourceOfCalculation;
        this.fundValue = fundValue;
        this.annuityCalculation = annuityCalculation;
        this.uploadedDocuments = uploadedDocuments;
        this.modeOfExit = modeOfExit;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public Approver getApprover() {
        return approver;
    }
 
    public void setApprover(Approver approver) {
        this.approver = approver;
    }
 
    public String getSourceOfCalculation() {
        return sourceOfCalculation;
    }
 
    public void setSourceOfCalculation(String sourceOfCalculation) {
        this.sourceOfCalculation = sourceOfCalculation;
    }
 
    public String getFundValue() {
        return fundValue;
    }
 
    public void setFundValue(String fundValue) {
        this.fundValue = fundValue;
    }
 
    public String getAnnuityCalculation() {
        return annuityCalculation;
    }
 
    public void setAnnuityCalculation(String annuityCalculation) {
        this.annuityCalculation = annuityCalculation;
    }
 
    public String getUploadedDocuments() {
        return uploadedDocuments;
    }
 
    public void setUploadedDocuments(String uploadedDocuments) {
        this.uploadedDocuments = uploadedDocuments;
    }
 
    public String getModeOfExit() {
        return modeOfExit;
    }
 
    public void setModeOfExit(String modeOfExit) {
        this.modeOfExit = modeOfExit;
    }
}