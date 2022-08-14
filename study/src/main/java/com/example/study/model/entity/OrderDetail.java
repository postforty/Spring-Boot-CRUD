package com.example.study.model.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity // order_detail
@ToString(exclude = {"user", "item"}) // �������� ������ ������ ��� ToString ��ȣ ������ StackOverflowError �߻�. ���� exclude�ؾ�.
public class OrderDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private LocalDateTime orderAt;
	
	// N : 1
	@ManyToOne
//	private Long userId;
	private User user; // user_id
	
	// N : 1
	@ManyToOne
//	private Long itemId;
	private Item item; // item_id

}
