package com.programmingkida;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringCloudConifgServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConifgServerApplication.class, args);
	}
}
