package com.mgcloudtech.repository;

import com.mgcloudtech.entities.EmployeeWorkAuth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface EmployeeWorkAuthRepo extends JpaRepository<EmployeeWorkAuth,Integer> {
    @Modifying
    @Transactional
    @Query("UPDATE EmployeeWorkAuth a SET a.visaStatus = :visaStatus, a.workAuthType = :workAuthType,a.active = :active, a.eadNumber = :eadNumber, a.updateBy = :updateBy WHERE a.id = :id")
    void updateEmployeeWorkAuth(@Param("id") Integer id, @Param("visaStatus") Enum visaStatus, @Param("workAuthType") Enum workAuthType, @Param("active") Boolean active, @Param("eadNumber") String eadNumber, @Param("updateBy") String updateBy);

}
