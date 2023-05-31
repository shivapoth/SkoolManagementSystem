package com.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.AttendanceTeacher;

public interface AttendanceTeacherRepo extends JpaRepository<AttendanceTeacher, Integer> {

}
