package com.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "class")
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clsNo;

    private String className;

    @ManyToOne
    @JoinColumn(name = "subNo")
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "tno")
    private Teacher teacher;

    @ManyToOne
    @JoinColumn(name = "sno")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "feeNo")
    private Fee fee;

    // Getters and setters
}

