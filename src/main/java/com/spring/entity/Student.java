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
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sno;

    private String studentName;
    private String email;
    private String mobileNo;
    private String password;
    private String availability;

    @ManyToOne
    @JoinColumn(name = "feeId")
    private Fee fee;

    @ManyToOne
    @JoinColumn(name = "clNo")
    private Classes cls;

    @ManyToOne
    @JoinColumn(name = "subNo")
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "atSno")
    private AttendanceStudent attendanceStudent;

    private Date joiningDate;

    // Getters and setters
}

