package com.example.study.model.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private Integer price;
	
	private String content;
	
	// 1 : N
	
	// LAZY = 지연로딩 , EAGER = 즉시로딩
	
	// LAZY = SELECT * FROM item where id = ?
	// EAGER = 1 : 1 그외 경우에는 사용 주의. 모든 연관 관계를 가져오기 때문
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "item")
	private List<OrderDetail> orderDetailList;
	

}
