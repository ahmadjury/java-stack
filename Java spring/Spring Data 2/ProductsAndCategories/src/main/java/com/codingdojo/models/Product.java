package com.codingdojo.models;

import java.util.Date;
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="_name")
	private String name;
	
	@Column(name="_description")
	 private String description;
	
	@Column(name="_price")
	private float price;
	
	 @Column(updatable=false)
	 @DateTimeFormat(pattern = "yyyy/MM/dd")
	 private Date createdAt;
	 @DateTimeFormat(pattern = "yyyy/MM/dd")
	 private Date updatedAt;
	 
	 @ManyToMany(fetch = FetchType.LAZY)
	 @JoinTable(
	    name = "categories_products", 
	    joinColumns = @JoinColumn(name = "product_id"), 
	    inverseJoinColumns = @JoinColumn(name = "category_id")
		 )
	 private List<Category> categories;

	 
	public Product(){	}


	public Product(String name, String description, float price, List<Category> categories) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.categories = categories;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public List<Category> getCategories() {
		return categories;
	}


	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	@PostPersist
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
	
	 
	 
	 
}
