package com.bbs.configmap.service;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "employee")
public class PropertyConfiguration {

    private String maxsalary;
    private String total;
}
