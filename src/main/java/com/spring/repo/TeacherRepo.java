package com.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.Teacher;

public interface TeacherRepo extends JpaRepository<Teacher, Integer> {

}
