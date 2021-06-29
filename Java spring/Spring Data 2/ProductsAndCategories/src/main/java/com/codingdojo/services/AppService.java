package com.codingdojo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.models.Category;
import com.codingdojo.models.CategoryProduct;
import com.codingdojo.models.Product;
import com.codingdojo.repositories.CategoryProductRepository;
import com.codingdojo.repositories.CategoryRepository;
import com.codingdojo.repositories.ProductRepository;

@Service
public class AppService {

 private final CategoryRepository categRepo;
 private final ProductRepository prodRepo;
 private final CategoryProductRepository catproRepo;
public AppService(CategoryRepository categRepo, ProductRepository prodRepo, CategoryProductRepository catproRepo) {
	super();
	this.categRepo = categRepo;
	this.prodRepo = prodRepo;
	this.catproRepo = catproRepo;
}
 
public Product findProductById(Long id) {
	return prodRepo.findById(id).orElse(null);
}

public Category findCategoryById(Long id) {
	return categRepo.findById(id).orElse(null);
}

public List<Product> unAddProducts (Category c){
	return prodRepo.findByCategoriesNotContains(c);
}
public List<Category> unAddCategory (Product p){
	return categRepo.findByProductsNotContains(p);
}
public Product addProduct (Product p) {
	return prodRepo.save(p);
}
public Category addCategory (Category c) {
	return categRepo.save(c);
}

public CategoryProduct add(CategoryProduct cp) {
	return catproRepo.save(cp);
}
}


