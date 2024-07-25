package com.mgcloudtech.controller;


import com.mgcloudtech.entities.EmployeeMarketingWorkAuth;
import com.mgcloudtech.entities.EmployeeWorkAuth;
import com.mgcloudtech.service.EmpMrktngWrkAuthService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mrktngwrkauth")
public class EmpMrktngWrkAuthController {

    @Autowired
    EmpMrktngWrkAuthService empMrktngWrkAuthService;

    @PostMapping
    public ResponseEntity<EmployeeMarketingWorkAuth> insertEmpMrktngWrkAuth(@RequestBody EmployeeMarketingWorkAuth employeeMarketingWorkAuth) {
        try {
            EmployeeMarketingWorkAuth newEmpMrktngWorkAuth = empMrktngWrkAuthService.insert(employeeMarketingWorkAuth);
            return new ResponseEntity<>(newEmpMrktngWorkAuth, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
