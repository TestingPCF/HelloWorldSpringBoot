package com.infotech.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(value="/")
	public String hello() {
		return "HCL PCF Jenkins Demo - using GitHub test-23 Apr 2019 1:00 pm";
	}
}
