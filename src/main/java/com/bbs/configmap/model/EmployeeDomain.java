package com.bbs.configmap.model;

import com.bbs.configmap.application.Employee;
import io.micrometer.core.annotation.Timed;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Getter
@Setter
@RefreshScope
@Component
public class EmployeeDomain {
    @Value("${emp.name}")
    private String name;
    @Value("${emp.address}")
    private String address;

    @Timed("configmap-world")
    public Employee generateEmployee(){
        Employee employee = new Employee();
        employee.setName(name);
        employee.setAddress(address);
        return employee;
    }

}