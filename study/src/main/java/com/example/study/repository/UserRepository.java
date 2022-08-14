package com.example.study.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.study.model.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

	// Optional�� ���� ���� ���� �� �� �ִ� ��츦 ����
	// query���� method ���·� �����ϱ� ������ QueryMethod��� �Ѵ�.
	// select * from user where account = ? << test03, test04
	Optional<User> findByAccount(String account);
	
	Optional<User> findByEmail(String email);
	
	// select * from user where account = ? and email = ?
	Optional<User> findByAccountAndEmail(String account, String email);
}
