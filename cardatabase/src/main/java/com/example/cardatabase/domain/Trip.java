package com.example.cardatabase.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity


public class Trip {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Tid;
	private String Name;
	@ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "car_Trip", joinColumns = { @JoinColumn(name =
     "Tid") }, inverseJoinColumns = { @JoinColumn(name = "id") }) 
    private Set<Car> cars = new HashSet<Car>(0); 

    public Set<Car> getCars() {
      return cars;
    }

    public void setCars(Set<Car> cars) {
      this.cars = cars;
    }

	public Trip(String name) {
		        super();
		        this.Name = name;
		      }
	public long getId() {
		return Tid;
	}
	public void setId(long Tid) {
		this.Tid = Tid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
//	public long getcarId() {
//		return carId;
//	}
//	public void setCarId(int carId) {
//		carId = carId;
//	}
}
