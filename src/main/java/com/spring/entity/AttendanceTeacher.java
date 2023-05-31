package com.spring.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "attendance_teacher")
public class AttendanceTeacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long atTno;

    private Date date;
    private String name;
    private String status;

    @ManyToOne
    @JoinColumn(name = "tno")
    private Teacher teacher;

    // Getters and setters
}

