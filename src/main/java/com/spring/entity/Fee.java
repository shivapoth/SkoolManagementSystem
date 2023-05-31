package com.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "fee")
public class Fee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long feeNo;

	private double dsFee;
	private double hFee;
	private double busFee;

	@ManyToOne
	@JoinColumn(name = "clsNo")
	private Classes cls;

	// Getters and setters
}
