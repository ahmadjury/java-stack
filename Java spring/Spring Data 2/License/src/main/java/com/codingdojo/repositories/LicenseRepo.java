package com.codingdojo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.models.License;

@Repository
public interface LicenseRepo extends CrudRepository<License, Long>{
	List<License> findAll();
	Optional<License> findById(Long id);
	License findTopByOrderByNumberDesc();

}
