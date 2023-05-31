package com.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.Classes;

public interface ClassesRepo extends JpaRepository<Classes, Integer> {

}
