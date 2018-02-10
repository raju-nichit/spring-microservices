package com.programmingkida.microservices.netflixzuulapigetwayserever;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
@EnableDiscoveryClient
public class NetflixZuulApiGetwaySereverApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixZuulApiGetwaySereverApplication.class, args);
	}

	@Bean
	public AlwaysSampler dafaultSampler() {
		return new AlwaysSampler();
	}
}
