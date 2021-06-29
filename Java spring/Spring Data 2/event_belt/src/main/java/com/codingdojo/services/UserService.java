package com.codingdojo.services;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.codingdojo.models.Event;

import com.codingdojo.models.User;
import com.codingdojo.repository.EventRepository;

import com.codingdojo.repository.UserRepository;

@Service
public class UserService {
	private final UserRepository userRepository;
	private final EventRepository eventRepository;


	public UserService(UserRepository userRepository,
			EventRepository eventRepository) {
		this.userRepository = userRepository;
		this.eventRepository = eventRepository;
	}

	// register user and hash their password
	public User registerUser(User user) {
		String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		user.setPassword(hashed);
		return userRepository.save(user);
	}

	// find user by email
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	// find user by id
	public User findUserById(Long id) {
//    	return userRepository.findById(id).orElse(null);

		Optional<User> u = userRepository.findById(id);
		if (u.isPresent()) {
			return u.get();
		} else {
			return null;
		}
	}

	// authenticate user
	public boolean authenticateUser(String email, String password) {
		// first find the user by email
		User user = userRepository.findByEmail(email);
		// if we can't find it by email, return false
		if (user == null) {
			return false;
		} else {
			// if the passwords match, return true, else, return false
			if (BCrypt.checkpw(password, user.getPassword())) {
				return true;
			} else {
				return false;
			}
		}
	}
////////////////////////////////////////////////////////
	public List<Event> bringEventInUserState(String state){
		return eventRepository.findByState(state);
	}

	
	public  List<Event> sortEvents(String state) {
		List<Event> events = eventRepository.findByState(state);
		return events;
	}
////////////////////////////////////////////////////////
public void createEvent(Event events) {
	eventRepository.save(events);
}
}
