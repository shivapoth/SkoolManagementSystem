package com.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.Fee;

public interface FeeRepo extends JpaRepository<Fee, Integer> {

}
