package com.mgcloudtech.service;


import com.mgcloudtech.entities.Education;
import com.mgcloudtech.repository.EducationRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class  EducationService {


    @Autowired
    private EducationRepo educationRepo;

    @Transactional
    public Education insert(Education education){
        return educationRepo.save(education);
    }
    @Transactional
    public void updateEducation(Integer id, Education education) {
        educationRepo.updateEducation(id,
                education.getEducationType(),education.getMajor(),education.getUniversityName(),education.getUniversityCountry(),education.getUpdateBy());
    }
}

