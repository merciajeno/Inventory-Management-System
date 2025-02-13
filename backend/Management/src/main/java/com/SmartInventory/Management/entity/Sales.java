package com.SmartInventory.Management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Sales {

	@Id
	private Long salesId;
	
	@ManyToMany
	private Product product;
	
	
	
}
