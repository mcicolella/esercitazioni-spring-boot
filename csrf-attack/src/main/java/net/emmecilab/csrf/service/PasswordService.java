package net.emmecilab.csrf.service;

import org.springframework.stereotype.Service;

@Service
public class PasswordService {

	public void changePassword(String newPassword) {
		// dummy method
		System.out.println("Customer password was changed to: " + newPassword);
	}
}
