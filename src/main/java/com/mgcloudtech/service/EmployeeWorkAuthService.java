package com.mgcloudtech.service;

import com.mgcloudtech.entities.EmployeeWorkAuth;
import com.mgcloudtech.repository.EmployeeWorkAuthRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeWorkAuthService {
    @Autowired
    private EmployeeWorkAuthRepo employeeWorkAuthRepo;

    @Transactional
    public EmployeeWorkAuth insert(EmployeeWorkAuth employeeWorkAuth){
        return employeeWorkAuthRepo.save(employeeWorkAuth);
    }

    @Transactional
    public void updateEmpWrkAuth(Integer id, EmployeeWorkAuth employeeWorkAuth) {
        employeeWorkAuthRepo.updateEmployeeWorkAuth(id,employeeWorkAuth.getVisaStatus(),employeeWorkAuth.getWorkAuthType(),
                employeeWorkAuth.getActive(),employeeWorkAuth.getEadNumber(),employeeWorkAuth.getUpdateBy());
    }
}
