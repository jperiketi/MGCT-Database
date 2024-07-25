package com.mgcloudtech.service;

import com.mgcloudtech.entities.EmployeeMarketingWorkAuth;
import com.mgcloudtech.repository.EmpMrktngWrkAuthRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmpMrktngWrkAuthService {

    @Autowired
    EmpMrktngWrkAuthRepo empMrktngWrkAuthRepo;

    @Transactional
    public EmployeeMarketingWorkAuth insert(EmployeeMarketingWorkAuth employeeMarketingWorkAuth){
        return empMrktngWrkAuthRepo.save(employeeMarketingWorkAuth);
    }
}
