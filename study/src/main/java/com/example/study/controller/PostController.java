package com.example.study.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.study.model.SearchParam;

@RestController
@RequestMapping("/api") // class에서 path가 중복되는 것은 상관 없다. method에서는 중복을 허용하지 않는다.
public class PostController {
	
	// HTML <Form>
	// ajax 검색
	// http post body -> data
	// json, xml, multipart-form / text-plain
	
	@PostMapping("/postMethod")
	public SearchParam postMethod(@RequestBody SearchParam searchParam) {
		return searchParam;
	}
}
