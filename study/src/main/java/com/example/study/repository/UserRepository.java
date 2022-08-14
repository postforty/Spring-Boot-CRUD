package com.example.study.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.study.model.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

	// Optional은 있을 수도 없을 수 도 있는 경우를 말함
	// query문을 method 형태로 관리하기 때문에 QueryMethod라고 한다.
	// select * from user where account = ? << test03, test04
	Optional<User> findByAccount(String account);
	
	Optional<User> findByEmail(String email);
	
	// select * from user where account = ? and email = ?
	Optional<User> findByAccountAndEmail(String account, String email);
}
