package com.mgcloudtech.controller;


import com.mgcloudtech.entities.EmployeeWorkAuth;
import com.mgcloudtech.service.EmployeeWorkAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/empwrkauth")
public class EmployeeWorkAuthController {

    @Autowired
    EmployeeWorkAuthService employeeWorkAuthService;

    @PatchMapping("/{id}")
    public ResponseEntity<Void> updateEmpWrkAuth(@PathVariable Integer id, @RequestBody EmployeeWorkAuth employeeWorkAuth) {
        employeeWorkAuthService.updateEmpWrkAuth(id, employeeWorkAuth);
        return ResponseEntity.ok().build();
    }
    @PostMapping
    public ResponseEntity<EmployeeWorkAuth> insertEmpWrkAuth(@RequestBody EmployeeWorkAuth employeeWorkAuth) {
        try {
            EmployeeWorkAuth newEmpWorkAuth = employeeWorkAuthService.insert(employeeWorkAuth);
            return new ResponseEntity<>(newEmpWorkAuth, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}

