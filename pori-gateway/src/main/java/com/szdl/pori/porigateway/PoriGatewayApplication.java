package com.szdl.pori.porigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient  //激活eureka中的DiscoveryClient实现
public class PoriGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PoriGatewayApplication.class, args);
	}
}
