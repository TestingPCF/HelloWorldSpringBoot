package com.infotech.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloWorldController {
	static Logger LOGGER = LoggerFactory.getLogger(HelloWorldController.class);
	
	@RequestMapping(value="/")
	public String hello() {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0)
				LOGGER.info("Logging hello() {even number}", i);
			else
				LOGGER.debug("Logging hello() {odd number}", i);
			}
		  try{
			  int data = 10;
			  LOGGER.info("Logger hello() - ok", data);
			  int divdata = data/0;
		  }catch(ArithmeticException aex){
			  LOGGER.error("Logger hello() - exception");
		  }
		  
		return "HCL PCF Jenkins Demo - using GitHub test-23 Apr 2019 12:42 pm";
	}
}
