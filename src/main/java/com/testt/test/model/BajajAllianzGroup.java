package com.testt.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bajaj_allianz_group")
public class BajajAllianzGroup {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="BAJAJ_ALLIANZ_GROUP_ID")
private Long id;

@Column(name="MIN_AGE")
private int minAge;

@Column(name="MAX_AGE")
private int maxAge;

@Column(name="MIN_SUM_ASSURED")
private double minSumAssured;

@Column(name="MAX_SUM_ASSURED")
private double maxSumAssured;

@Column(name="ANNUAL_INCOME")
private double annualIncome;

@Column(name="POLICY_TENURE")
private int policyTenure;

@Column(name="MEMBER_ELIGIBLE")
private boolean memberEligible;

@Column(name="SPOUSE_ELIGIBLE")
private boolean spouseEligible;

@Column(name="OTP_AUTHENTICATION")
private boolean otpAuthentication;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public int getMinAge() {
	return minAge;
}

public void setMinAge(int minAge) {
	this.minAge = minAge;
}

public int getMaxAge() {
	return maxAge;
}

public void setMaxAge(int maxAge) {
	this.maxAge = maxAge;
}

public double getMinSumAssured() {
	return minSumAssured;
}

public void setMinSumAssured(double minSumAssured) {
	this.minSumAssured = minSumAssured;
}

public double getMaxSumAssured() {
	return maxSumAssured;
}

public void setMaxSumAssured(double maxSumAssured) {
	this.maxSumAssured = maxSumAssured;
}

public double getAnnualIncome() {
	return annualIncome;
}

public void setAnnualIncome(double annualIncome) {
	this.annualIncome = annualIncome;
}

public int getPolicyTenure() {
	return policyTenure;
}

public void setPolicyTenure(int policyTenure) {
	this.policyTenure = policyTenure;
}

public boolean isMemberEligible() {
	return memberEligible;
}

public void setMemberEligible(boolean memberEligible) {
	this.memberEligible = memberEligible;
}

public boolean isSpouseEligible() {
	return spouseEligible;
}

public void setSpouseEligible(boolean spouseEligible) {
	this.spouseEligible = spouseEligible;
}

public boolean isOtpAuthentication() {
	return otpAuthentication;
}

public void setOtpAuthentication(boolean otpAuthentication) {
	this.otpAuthentication = otpAuthentication;
}

}