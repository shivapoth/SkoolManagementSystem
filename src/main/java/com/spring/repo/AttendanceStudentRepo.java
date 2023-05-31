package com.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.AttendanceStudent;

public interface AttendanceStudentRepo extends JpaRepository<AttendanceStudent, Integer> {

}
