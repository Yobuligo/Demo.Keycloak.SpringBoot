package com.yobuligo.DemoKeycloak.Customer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {

	@GetMapping("/customers")
	public String getCustomers(Model model) {
		return "customers";
	}

	@GetMapping("/logout")
	public String logout(HttpServletRequest request) throws ServletException {
		request.logout();
		return "/";
	}

}
