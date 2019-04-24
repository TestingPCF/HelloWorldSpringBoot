package com.infotech.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloWorldController {
	static Logger LOGGER = LoggerFactory.getLogger(HelloWorldController.class);
	private static int count=0;
	@RequestMapping(value="/")
	public String hello() {
			if (count % 2 == 0)
				LOGGER.info("Logging hello() {even number}", count);
			else
				LOGGER.info("Logging hello() {odd number}", count);
			count++;
		  try{
			 if(count==5) {
			  LOGGER.info("Logger hello() - ok and reached on top level", count);
			  int c = count/0;
			 }
		  }catch(ArithmeticException aex){
			  LOGGER.error("Logger hello() - exception");
			  count=0;
		  }
		  
		return "HCL PCF Jenkins Demo - using GitHub test-23 Apr 2019 12:42 pm";
	}
}
