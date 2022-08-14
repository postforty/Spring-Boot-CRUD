package com.example.study.repository;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.Item;

public class ItemRepositoryTest extends StudyApplicationTests {
	
	@Autowired
	private ItemRepository itemRepository;
	
	@Test
	public void create() {
		
		Item item = new Item();
		item.setName("≥Î∆Æ∫œ");
		item.setPrice(100000);
		item.setContent("ªÔº∫ ≥Î∆Æ∫œ");
		
		Item newItem = itemRepository.save(item);
		assertNotNull(newItem);
	}
	
	@Test
	public void read() {
		Long id = 1L;
		
		Optional<Item> item = itemRepository.findById(id);
		assertTrue(item.isPresent());
		
//		item.ifPresent(i -> {
//			System.out.println(i);
//		});
	}
	
}
