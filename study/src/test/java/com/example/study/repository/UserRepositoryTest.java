package com.example.study.repository;

import java.util.Optional;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.Item;
import com.example.study.model.entity.User;

public class UserRepositoryTest extends StudyApplicationTests {

	// @Autowired´Â DI ¿ªÇÒÀ» ÇÔ. ½Ì±ÛÅæ
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
	
	@Test
	@Transactional
	public void read() {
		
		// select * from user where id = ?
//		Optional<User> user = userRepository.findById(5L);
		Optional<User> user = userRepository.findByAccount("TestUser03");
		
		user.ifPresent(selectUser ->{
//			System.out.println("user : "+selectUser);
//			System.out.println("email : "+selectUser.getEmail());
			
			selectUser.getOrderDetailList().stream().forEach(detail -> {
				Item item = detail.getItem();
				System.out.println(item);
				
			});
			
		});
		
	}
	
//	@Test
//	public void update() {
//		Optional<User> user = userRepository.findById(2L);
//		
//		user.ifPresent(selectUser ->{
//			selectUser.setAccount("PPPP");
//			selectUser.setUpdatedAt(LocalDateTime.now());
//			selectUser.setUpdatedBy("update method()");
//			
//			userRepository.save(selectUser);
//		});
//	}
//	
//	@Test
//	@Transactional // Roll back
//	public void delete() {
//		Optional<User> user = userRepository.findById(1L);
//		
//		assertTrue(user.isPresent());
//		
//		user.ifPresent(selectUser ->{
//			userRepository.delete(selectUser);
//		});
//		
//		Optional<User> deleteUser = userRepository.findById(1L);
//		
//		assertFalse(deleteUser.isPresent());
//		
//	}
}
