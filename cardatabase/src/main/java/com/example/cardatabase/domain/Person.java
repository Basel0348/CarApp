package com.example.cardatabase.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String name;
	private Set<PersonTrip> PersonTrip;
	
	public Person() {}
	@OneToMany(mappedBy = "Person")

	public Set<PersonTrip> getPersonTrip() {
		return PersonTrip;
	}
	public void setPersonTrip(Set<PersonTrip> personTrip) {
		PersonTrip = personTrip;
	}
	public Person(String name) {
		super();
		this.name=name;
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
