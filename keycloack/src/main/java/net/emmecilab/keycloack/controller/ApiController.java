package net.emmecilab.keycloack.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/anonymous")
    public String getAnonymousInfo() {
        return "Anonymous request";
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('USER')")
    public String getUserInfo() {
        return "User info";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String getAdminInfo() {
        return "Admin info";
    }

    @GetMapping("/service")
    @PreAuthorize("hasRole('SERVICE')")
    public String getServiceInfo() {
        return "Service info";
    }

    @GetMapping("/me")
    public String getMe() {
		final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }
   
   
}
