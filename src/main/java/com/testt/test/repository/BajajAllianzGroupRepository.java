package com.testt.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BajajAllianzGroupRepository extends JpaRepository<BajajAllianzGroup, Long>{

@Query("SELECT SUM(MIN_SUM_ASSURED, MAX_SUM_ASSURED) FROM BajajAllianzGroup WHERE MIN_AGE <= ?1 AND MAX_AGE >= ?1 AND ANNUAL_INCOME >= 40000")
double getSumAssured(int age);

@Query("SELECT POLICY_TENURE FROM BajajAllianzGroup WHERE POLICY_TENURE IN (12,15,18,24)")
int getPolicyTenure();

@Query("SELECT * FROM BajajAllianzGroup WHERE MEMBER_ELIGIBLE = ?1 AND SPOUSE_ELIGIBLE = ?1 AND OTP_AUTHENTICATION = ?2")
BajajAllianzGroup getEligibility(boolean isEligible, boolean isOTPAuthenticated);

}