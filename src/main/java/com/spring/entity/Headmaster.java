package com.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "headmaster")
public class Headmaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hno;

    private String headMasterName;
    private String email;
    private String password;
    private String mobileNo;

    @ManyToOne
    @JoinColumn(name = "tno")
    private Teacher teacher;

    @ManyToOne
    @JoinColumn(name = "sno")
    private Student student;

    // Getters and setters
}
