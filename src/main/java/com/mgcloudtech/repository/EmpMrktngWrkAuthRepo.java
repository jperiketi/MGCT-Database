package com.mgcloudtech.repository;

import com.mgcloudtech.entities.EmployeeMarketingWorkAuth;
import com.mgcloudtech.entities.MgctOffshoreEmployees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;

public interface EmpMrktngWrkAuthRepo extends JpaRepository<EmployeeMarketingWorkAuth, Integer> {

    @Query("UPDATE EmployeeMarketingWorkAuth a SET a.recruiter = :recruiter, a.visaStatus = :visaStatus, a.workAuthType = :workAuthType,a.roleResume = :roleResume, a.yearsOfExp = :yearsOfExp,a.workAuthStartDate = :workAuthStartDate,a.workAuthEndDate =:workAuthEndDate,a.updateBy = :updateBy WHERE a.id = :id")
    void updateEducation(@Param("id") Integer id,@Param("recruiter") MgctOffshoreEmployees mgctOffshoreEmployees, @Param("visaStatus") Enum visaStatus, @Param("workAuthType") Enum workAuthType, @Param("roleResume") String roleResume, @Param("yearsOfExp") Integer yearsOfExp, @Param("workAuthStartDate") Date workAuthStartDate, @Param("workAuthEndDate") Date workAuthEndDate, @Param("updateBy") String updateBy);
}