package com.mgcloudtech.service;

import com.mgcloudtech.entities.MgctOffshoreEmployees;
import com.mgcloudtech.repository.MgctOffShoreEmpRepo;
import com.mgcloudtech.utils.CustomBeanUtils;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MgctOffShoreEmpService {

    @Autowired
    MgctOffShoreEmpRepo mgctOffShoreEmpRepo;

    @Transactional
    public MgctOffshoreEmployees insert(MgctOffshoreEmployees mgctOffshoreEmployees){
        return mgctOffShoreEmpRepo.save(mgctOffshoreEmployees);
    }

    @Transactional
    public MgctOffshoreEmployees updateMgctOffShoreEmployee(Integer id, MgctOffshoreEmployees mgctOffshoreEmployees) {

        Optional<MgctOffshoreEmployees> employeeToUpdate = mgctOffShoreEmpRepo.findById(id);

        if (employeeToUpdate.isPresent()) {
            MgctOffshoreEmployees existingEmployee = employeeToUpdate.get();

            CustomBeanUtils.copyNonNullProperties(mgctOffshoreEmployees, existingEmployee);


            return mgctOffShoreEmpRepo.save(existingEmployee);
        } else {
            throw new RuntimeException("Employee not found with id " + id);
        }
    }
}

