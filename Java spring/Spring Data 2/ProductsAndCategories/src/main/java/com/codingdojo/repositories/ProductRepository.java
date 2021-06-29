package com.codingdojo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.models.Category;
import com.codingdojo.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
	List <Product> findAll(); 
	List <Product> findByCategoriesNotContains(Category category);
}


