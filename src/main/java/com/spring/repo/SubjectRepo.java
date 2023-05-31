package com.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.Subject;

public interface SubjectRepo extends JpaRepository<Subject, Integer> {

}
