package com.codingdojo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.models.Dojo;
@Repository
public interface DojoRepo extends CrudRepository<Dojo, Long> {
	
	List<Dojo> findAll();

}
