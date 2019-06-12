package com.stackroute.springeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//enabled eureka to register and monitor the clientservices
@EnableEurekaServer
@SpringBootApplication
public class SpringEurekaServerApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringEurekaServerApplication.class, args);
	}

}
