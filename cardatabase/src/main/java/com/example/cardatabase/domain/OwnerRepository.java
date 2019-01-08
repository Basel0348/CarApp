package com.example.cardatabase.domain;

import javax.persistence.Entity;

import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long>  {

}
