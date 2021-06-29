package com.codingdojo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.models.Event;

@Repository
public interface EventRepository extends CrudRepository<Event, Long> {
		List<Event> findByState(String asd);
//		List<Event> findByNotState(String asd);
}
