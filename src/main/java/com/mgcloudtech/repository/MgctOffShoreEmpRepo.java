package com.mgcloudtech.repository;

import com.mgcloudtech.entities.MgctOffshoreEmployees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.relational.core.sql.In;

public interface MgctOffShoreEmpRepo extends JpaRepository<MgctOffshoreEmployees, Integer> {
}
