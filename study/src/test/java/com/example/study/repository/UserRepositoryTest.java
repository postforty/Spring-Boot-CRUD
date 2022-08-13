package com.example.study.repository;

import java.time.LocalDateTime;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.User;

public class UserRepositoryTest extends StudyApplicationTests {

	// @Autowired�� DI ������ ��. �̱���
	@Autowired
	private UserRepository userRepository;
	
//	@Test
//	public void create() {
//		User user = new User();
//		user.setAccount("TestUser03");
//		user.setEmail("TestUser03@gmail.com");
//		user.setPhoneNumber("010-3333-3333");
//		user.setCreatedAt(LocalDateTime.now());
//		user.setCreatedBy("TestUser03");
//		
//		User newUser = userRepository.save(user);
//		System.out.println("newUser : "+newUser);
//				
//	}
	
//	@Test
//	public void read() {
//		Optional<User> user = userRepository.findById(2L);
//		
//		user.ifPresent(selectUser ->{
//			System.out.println("user : "+selectUser);
//			System.out.println("email : "+selectUser.getEmail());
//			
//		});
//		
//	}
	
	@Test
	public void update() {
		Optional<User> user = userRepository.findById(2L);
		
		user.ifPresent(selectUser ->{
			selectUser.setAccount("PPPP");
			selectUser.setUpdatedAt(LocalDateTime.now());
			selectUser.setUpdatedBy("update method()");
			
			userRepository.save(selectUser);
		});
	}
	
	public void delete() {
		
	}
}
