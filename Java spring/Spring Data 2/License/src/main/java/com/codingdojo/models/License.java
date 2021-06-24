package com.codingdojo.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;



@Entity
@Table(name="licenses")
public class License {
@Id
@GeneratedValue
private Long id;


@Column(name="number")
private String number;


@Column(name="expiration")
@DateTimeFormat(pattern="yyyy-MM-dd")
private Date expiration;


@Column(name="state")
@Size(max=2)
@NotNull
private String state; 



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

public String getNumber() {
	return number;
}

public void setNumber(String number) {
	this.number = number;
}

public Date getExpiration() {
	return expiration;
}

public void setExpiration(Date expiration) {
	this.expiration = expiration;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public Person getPerson() {
	return person;
}

public void setPerson(Person person) {
	this.person = person;
}

}
