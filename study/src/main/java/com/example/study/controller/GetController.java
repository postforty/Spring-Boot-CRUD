package com.example.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") // localhost:8080/api
public class GetController {

	@RequestMapping(method = RequestMethod.GET, path = "/getMethod") // localhost:8080/api/getMethod
	public String getRequest() {
		
		return "Hi getMethod";
	}
	
	@GetMapping("/getParameter") // localhost:8080/api/getParameter?id=1234&password=abcd
	public String getParameter(@RequestParam String id, @RequestParam String password) {
		System.out.println("id : "+id);
		System.out.println("password : "+password);
		
		return id+password;
		
	}
}
