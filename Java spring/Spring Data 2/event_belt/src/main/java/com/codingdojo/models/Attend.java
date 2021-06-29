package com.codingdojo.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "attend")
public class Attend {
	 	@Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Long id;
	 	
	 	private String name;
		@ManyToOne(fetch = FetchType.LAZY )
		@JoinColumn(name="user_id")
	 	private User user;
		@ManyToOne(fetch = FetchType.LAZY )
		@JoinColumn(name="event_id")
	 	private Event event;
		
		public Attend() {
			super();
		}
		public Attend( String name, User user, Event event) {
			super();
			this.name = name;
			this.user = user;
			this.event = event;
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
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		public Event getEvent() {
			return event;
		}
		public void setEvent(Event event) {
			this.event = event;
		}
		
		
		

}
