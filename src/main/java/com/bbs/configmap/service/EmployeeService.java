package com.bbs.configmap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class EmployeeService {
    @Autowired
    private PropertyConfiguration configuration;

    @Scheduled(fixedDelay = 5000)
    public void verifyEmployeeProperty(){
        System.out.println(" Employee Max Salary is  "+configuration.getMaxsalary());
        System.out.println("Total employee count is "+configuration.getTotal());
    }
}
