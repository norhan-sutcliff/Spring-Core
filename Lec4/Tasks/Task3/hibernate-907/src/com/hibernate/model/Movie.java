package com.hibernate.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import java.util.List;

@Entity()
public class Movie {
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;

    @ManyToMany
    @JoinTable(name="movie_actor",
        joinColumns=@JoinColumn(name="movie_id"),
        inverseJoinColumns=@JoinColumn(name="actor_id"))
    private List<Actor> actors;
}
