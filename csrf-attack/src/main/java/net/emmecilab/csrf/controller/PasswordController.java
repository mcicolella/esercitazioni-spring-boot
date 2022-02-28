package net.emmecilab.csrf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.emmecilab.csrf.service.PasswordService;

@Controller
public class PasswordController {
	@Autowired
	private PasswordService customerPasswordService;

	@PostMapping("/change-password")
	public String changeCustomerPassword(@RequestParam String newPassword, Model model) {
		System.out.println("New Password: " + newPassword);
		customerPasswordService.changePassword(newPassword);
		model.addAttribute("newPassword", newPassword);
		return "passwordChanged";
	}
}
