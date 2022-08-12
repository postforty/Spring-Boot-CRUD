package com.example.study.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.study.model.SearchParam;

@RestController
@RequestMapping("/api") // class���� path�� �ߺ��Ǵ� ���� ��� ����. method������ �ߺ��� ������� �ʴ´�.
public class PostController {
	
	// HTML <Form>
	// ajax �˻�
	// http post body -> data
	// json, xml, multipart-form / text-plain
	
	@PostMapping("/postMethod")
	public SearchParam postMethod(@RequestBody SearchParam searchParam) {
		return searchParam;
	}
}
