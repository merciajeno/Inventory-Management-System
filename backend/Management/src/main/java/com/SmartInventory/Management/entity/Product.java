package com.SmartInventory.Management.entity;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Product {

	@Id
	private Long productId;
	
	private String productName;
	private double productPrice;
	private String category;
	private Long stocklevel;
	private Long noOfProductsSold;
	
	
	public Product() {
		super();
	}
	
	
	public Product(Long productId, String productName, double productPrice, Long stocklevel) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.stocklevel = stocklevel;
	}


	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Long getStocklevel() {
		return stocklevel;
	}
	public void setStocklevel(Long stocklevel) {
		this.stocklevel = stocklevel;
	}
	public Long getNoOfProductsSold() {
		return noOfProductsSold;
	}
	public void setNoOfProductsSold(Long noOfProductsSold) {
		this.noOfProductsSold = noOfProductsSold;
	}
	
	
	
}
