package com.bbs.configmap.controller;

import com.bbs.configmap.application.Employee;
import com.bbs.configmap.model.EmployeeDomain;
import io.micrometer.core.annotation.Timed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDomain employeeDomain;

    @GetMapping("/employee/{id}")
    @Timed
    public Employee getEmployee(@PathVariable String id) {
        System.out.println("Getting Employye id " + id);
        return employeeDomain.generateEmployee();

    }

}
