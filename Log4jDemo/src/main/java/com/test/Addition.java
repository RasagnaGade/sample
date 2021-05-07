package com.test;


import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Addition {
	Logger logger = Logger.getLogger(this.getClass());
	@GetMapping("/add/{num1}/{num2}")
	public String sumOfTwo(@PathVariable int num1, @PathVariable int num2) {
		logger.info("sum=" +(num1 + num2));
		logger.debug("date = " +new java.util.Date());
		logger.info("hello");
		return "Sum" +(num1 + num2);
	}
}
