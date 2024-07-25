package com.mgcloudtech.controller;

import com.mgcloudtech.entities.Employee;
import com.mgcloudtech.entities.MgctOffshoreEmployees;
import com.mgcloudtech.service.MgctOffShoreEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/offshoreemp")
public class MgctOffShoreEmpController {

    @Autowired
    MgctOffShoreEmpService mgctOffShoreEmpService;


    @PostMapping
    public ResponseEntity<MgctOffshoreEmployees> insertMgctOffShoreEmployee(@RequestBody MgctOffshoreEmployees mgctOffshoreEmployees) {
        try {
            MgctOffshoreEmployees newMgctOffShoreEmployee = mgctOffShoreEmpService.insert(mgctOffshoreEmployees);
            return new ResponseEntity<>(newMgctOffShoreEmployee, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<MgctOffshoreEmployees> updateEmployee(@PathVariable Integer id, @RequestBody MgctOffshoreEmployees mgctOffshoreEmployees) {
        try {
            MgctOffshoreEmployees updatedEmployee = mgctOffShoreEmpService.updateMgctOffShoreEmployee(id, mgctOffshoreEmployees);
            return new ResponseEntity<>(updatedEmployee, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
