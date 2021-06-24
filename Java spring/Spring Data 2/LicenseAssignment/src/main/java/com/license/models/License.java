package com.license.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

@Entity


public class License {
@Id
@GeneratedValue
private Long id;

@NotNull
@Column(name="number")
private Integer number;

@NotNull
@Column(name="expiration")
@DateTimeFormat(pattern="yyyy-MM-dd")
private Date expiration;

@NotNull
@Column(name="state")
private char state; 



@Column(updatable=false)
@DateTimeFormat(pattern="yyyy-MM-dd")
private Date createdAt;
@DateTimeFormat(pattern="yyyy-MM-dd")
private Date updatedAt;

@OneToOne(fetch = FetchType.LAZY)
@JoinColumn(name="person_id")
private Person person;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public Integer getNumber() {
	return number;
}

public void setNumber(Integer number) {
	this.number = number;
}

public Date getExpiration() {
	return expiration;
}

public void setExpiration(Date expiration) {
	this.expiration = expiration;
}

public char getState() {
	return state;
}

public void setState(char state) {
	this.state = state;
}

public Person getPerson() {
	return person;
}

public void setPerson(Person person) {
	this.person = person;
}

}
