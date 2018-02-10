package com.programmingkida.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programmingkida.microservices.limitsservice.beans.LimitConfiguration;
import com.programmingkida.microservices.limitsservice.cfg.Configuration;

@RestController
public class LimitConfigurationController {

	@Autowired
	private Configuration cfg;

	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitConfiguration() {
		return new LimitConfiguration(cfg.getMinimum(), cfg.getMaximum());
	}
}
