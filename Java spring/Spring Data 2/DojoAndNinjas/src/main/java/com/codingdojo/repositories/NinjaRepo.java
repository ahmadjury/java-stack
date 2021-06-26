package com.codingdojo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.models.Dojo;
import com.codingdojo.models.Ninja;
@Repository
public interface NinjaRepo extends CrudRepository<Ninja, Long>{

	List<Ninja> findAll();
//	List<Ninja> findNinjaByDojoName(Dojo dojo);
	List<Ninja> findNinjaByDojoId(Long id);
	

}
