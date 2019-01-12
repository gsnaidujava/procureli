package com.procureli.procure2pay.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@RequestMapping("/")
	public String welcome(){
		return "welcome to spring boot";
	}
}
