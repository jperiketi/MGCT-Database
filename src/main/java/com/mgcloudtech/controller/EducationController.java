package com.mgcloudtech.controller;

import com.mgcloudtech.entities.Education;
import com.mgcloudtech.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/education")
public class EducationController {

    @Autowired
    EducationService educationService;
    @PatchMapping("/{id}")
    public ResponseEntity<Void> updateEducation(@PathVariable Integer id, @RequestBody Education education) {
        educationService.updateEducation(id, education);
        return ResponseEntity.ok().build();
    }


    @PostMapping
    public ResponseEntity<Education> insertEducation(@RequestBody Education education) {
        try {
            Education newEducation = educationService.insert(education);
            return new ResponseEntity<>(newEducation, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}