package com.datajpa.domain;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Teacher extends Person {
	private Long salary;
}
