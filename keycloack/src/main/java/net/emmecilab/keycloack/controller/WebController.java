package net.emmecilab.keycloack.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

	@GetMapping(path = "/")
    public String index() {
        return "index";
    }
	
	@GetMapping(path = "/hello")
    @PreAuthorize("hasRole('USER')")
    public String hello() {
        return "hello";
    }
}
