package com.createiq;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/hello")
	public String name() {
		return "Balaji is a java Devloper";
	}
	
	@GetMapping("/info")
	public String info() {
		return "CI/CD Test App";
	}
}
