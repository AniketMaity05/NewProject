package com.aniket.SpringBoot.Demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	@GetMapping("/")
	public String getMsg() {
		String s="Good Morning !!!";
		return s + " Welcome to the Maity Resturent..!!";
	}
}
