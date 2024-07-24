package com.mgcloudtech.service;


import com.mgcloudtech.entities.Employee;
import com.mgcloudtech.repository.EmployeeRepo;
import com.mgcloudtech.utils.CustomBeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeesService {
    @Autowired
    private EmployeeRepo employeesRepo;


    public List<Employee> getAllEmployees() {
        System.out.println(employeesRepo.findAll());
        return employeesRepo.findAll();
    }

    @Transactional
    public Employee createEmployee(Employee employee) {
        if (employee.getAddresses() != null) {
            for (var address : employee.getAddresses()) {
                address.setEmployee(employee);
            }
        }
        if (employee.getEducations() != null) {
            for (var education : employee.getEducations()) {
                education.setEmployee(employee);
            }
        }

        if (employee.getEmployeeWorkAuths() != null) {
            for (var workAuth : employee.getEmployeeWorkAuths()) {
                workAuth.setEmployee(employee);
            }
        }
        return employeesRepo.save(employee);
    }

    @Transactional
    public Employee updateEmployee(Integer empId, Employee employeeDetails) {

        Optional<Employee> employeeToUpdate = employeesRepo.findById(empId);

        if (employeeToUpdate.isPresent()) {
            Employee existingEmployee = employeeToUpdate.get();

            CustomBeanUtils.copyNonNullProperties(employeeDetails, existingEmployee);


            return employeesRepo.save(existingEmployee);
        } else {
            throw new RuntimeException("Employee not found with id " + empId);
        }
    }
    }

