package com.example.cardatabase.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Person_Trips")
public class PersonTrip implements Serializable {

	private Trip Trip;
	private Person Person;
	private String Item;
	
	@Id
    @ManyToOne
    @JoinColumn(name = "Person_Is")
    public Person getPerson() {
        return Person;
    }
	@Id
    @ManyToOne
    @JoinColumn(name = "Trip_Id")
    public Trip getTrip() {
        return Trip;
    }
	@Column(name = "Item")
    public String getItem() {
        return Item;
    }

    public void setItem(String Item) {
        this.Item = Item;
    }
	
}
