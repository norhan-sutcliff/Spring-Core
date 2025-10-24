package com.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity()
public class Passport {
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String passportNumber;

    @OneToOne
    private Student student;
}
