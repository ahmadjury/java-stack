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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "events")
public class Event {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "attend", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "event_id"))
	private List<Event> eventsAttending;
	
	
	@Column(name="_name")
	private String name;
	
	private String city;
	
	private String state;
	@DateTimeFormat(pattern = "yyyy-MM-yy")
	private Date date;


	@Column(updatable = false)
	private Date createdAt;
	private Date updatedAt;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "event")
	private List<Message> messages;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User planner;
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "users_events", joinColumns = @JoinColumn(name = "event_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
	private List<User> attendees;

	private String state_Event;

	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}


	public Event() {

	}



	public Event(Long id, List<Event> eventsAttending, String name, String city, String state, Date date,
			List<Message> messages, User planner, List<User> attendees, String state_Event) {
		super();
		this.id = id;
		this.eventsAttending = eventsAttending;
		this.name = name;
		this.city = city;
		this.state = state;
		this.date = date;
		this.messages = messages;
		this.planner = planner;
		this.attendees = attendees;
		this.state_Event = state_Event;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public User getPlanner() {
		return planner;
	}

	public void setPlanner(User planner) {
		this.planner = planner;
	}

	public List<User> getAttendees() {
		return attendees;
	}

	public void setAttendees(List<User> attendees) {
		this.attendees = attendees;
	}

	public List<Event> getEventsAttending() {
		return eventsAttending;
	}

	public void setEventsAttending(List<Event> eventsAttending) {
		this.eventsAttending = eventsAttending;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getState_Event() {
		return state_Event;
	}

	public void setState_Event(String state_Event) {
		this.state_Event = state_Event;
	}

}
