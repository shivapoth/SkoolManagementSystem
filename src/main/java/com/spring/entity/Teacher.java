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
@Table(name = "teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tno;

    private String teacherName;
    private String email;
    private String mobileNo;
    private String password;
    private double salary;
    private String availability;

    @ManyToOne
    @JoinColumn(name = "clNo")
    private Classes cls;

    @ManyToOne
    @JoinColumn(name = "subNo")
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "atTno")
    private AttendanceTeacher attendanceTeacher;

    private Date joiningDate;

    // Getters and setters
}

