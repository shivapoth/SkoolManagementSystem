package com.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "subject")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subNo;

    private String subjectName;

    @ManyToOne
    @JoinColumn(name = "tno")
    private Teacher teacher;

    @ManyToOne
    @JoinColumn(name = "sno")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "clsNo")
    private Classes cls;

    // Getters and setters
}
