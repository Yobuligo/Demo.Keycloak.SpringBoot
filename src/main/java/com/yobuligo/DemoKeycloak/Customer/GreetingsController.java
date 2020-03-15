package com.yobuligo.DemoKeycloak.Customer;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingsController {

	@GetMapping("/greetings")
	public String greetings(Principal principal) {
		return "greetings";
	}

}
