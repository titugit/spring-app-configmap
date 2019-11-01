package com.bbs.configmap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAppConfigmapApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAppConfigmapApplication.class, args);
//		SpringApplication application = new SpringApplication(SpringAppConfigmapApplication.class);
//		application.setWebApplicationType(WebApplicationType.REACTIVE);
//		application.run(args);
	}

}
