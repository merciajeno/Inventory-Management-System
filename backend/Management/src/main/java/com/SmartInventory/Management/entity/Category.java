package com.SmartInventory.Management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Category {

	@Id
	private Long categoryId;
	private String category;
	private long noOfProducts;
	
	public Category(Long categoryId, String category, long noOfProducts) {
		super();
		this.categoryId = categoryId;
		this.category = category;
		this.noOfProducts = noOfProducts;
	}
	public Category() {
		super();
	}
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public long getNoOfProducts() {
		return noOfProducts;
	}
	public void setNoOfProducts(long noOfProducts) {
		this.noOfProducts = noOfProducts;
	}
	
	
}
