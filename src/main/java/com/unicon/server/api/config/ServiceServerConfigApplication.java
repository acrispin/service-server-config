package com.unicon.server.api.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author acrispin
 * @since 12/15/2019
 */
@EnableConfigServer
@SpringBootApplication
public class ServiceServerConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceServerConfigApplication.class, args);
	}

}
