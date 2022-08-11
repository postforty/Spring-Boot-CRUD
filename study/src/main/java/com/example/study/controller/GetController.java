package com.example.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.study.model.SearchParam;

@RestController
@RequestMapping("/api") // localhost:8080/api
public class GetController {

	@RequestMapping(method = RequestMethod.GET, path = "/getMethod") // localhost:8080/api/getMethod
	public String getRequest() {
		
		return "Hi getMethod";
	}
	
	@GetMapping("/getParameter") // localhost:8080/api/getParameter?id=1234&password=abcd
	public String getParameter(@RequestParam String id, @RequestParam(name = "password") String pwd) {
		String password = "bbbb";
		
		System.out.println("id : "+id);
		System.out.println("pwd : "+pwd);
		
		return id+pwd;
	}
	
	// 객체로 파라미터를 받는 방법
	// localhost:8080/api/getMultiParameter?account=abcd&email=study@gmail.com&page=10
	@GetMapping("/getMultiParameter")
	public SearchParam getMultiParameter(SearchParam searchParam) {
		System.out.println(searchParam.getAccount());
		System.out.println(searchParam.getEmail());
		System.out.println(searchParam.getPage());
		
		// json형식 처리
		// {"account" : "", "email" : "", "page" : 0}
		return searchParam; // 객체를 return하면 자동적으로 json형식으로 처리한다.
	}
}
