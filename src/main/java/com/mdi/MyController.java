package com.mdi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/")
	public String sayHello() {
		return "halleluyah";
	}

	@GetMapping("/hello")
	public String getMethodName(@RequestParam("print") String param) {
		return "Hello " + param;
	}

}
