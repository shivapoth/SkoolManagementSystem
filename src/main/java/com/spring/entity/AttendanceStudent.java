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
@Table(name = "attendance_student")
public class AttendanceStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long atSno;

    private Date date;
    private String name;
    private String status;

    @ManyToOne
    @JoinColumn(name = "sno")
    private Student student;

    // Getters and setters
}

