package net.emmecilab.interceptors.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterceptorController {

	@GetMapping("/demo")
	public String  demo() {
		return "Calling /demo endpoint";
	}
	
	@GetMapping("/demo2")
	public String  demo2() {
		return "Calling /demo2 endpoint";
	}
}
