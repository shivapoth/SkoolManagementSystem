package com.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.Headmaster;

public interface HeadmasterRepo extends JpaRepository<Headmaster, Integer> {

}
