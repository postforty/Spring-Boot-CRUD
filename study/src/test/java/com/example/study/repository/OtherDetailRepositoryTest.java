package com.example.study.repository;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.OrderDetail;

public class OtherDetailRepositoryTest extends StudyApplicationTests {
	
	@Autowired
	private OrderDetailRepository orderDetailRepository;
	
	@Test
	public void create() {
		OrderDetail orderDetail = new OrderDetail();

		orderDetail.setOrderAt(LocalDateTime.now());
		
		// � ���?
		orderDetail.setUserId(5L);
		
		// � ��ǰ?
		orderDetail.setItemId(2L);
		
		OrderDetail newOrderDetail = orderDetailRepository.save(orderDetail);
		assertNotNull(newOrderDetail);
	}

}
