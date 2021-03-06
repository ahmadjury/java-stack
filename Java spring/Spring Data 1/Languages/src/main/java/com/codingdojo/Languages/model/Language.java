package com.codingdojo.Languages.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

@Entity
@Table(name="languages")
public class Language {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	@Size(min=3 , max=20)
	private String name;
	@NotNull
	@Size(min=3 , max=20)
	private String creator;
	@NotNull
	private Double version;
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date CreatedAt;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date UpdatedAt;
	public Language() {
	}
//	public Language(String name, String creator,Double version) {
//		this.name=name;
//		this.creator = creator;
//		this.version = version;
//	}
	@PrePersist
	protected void onCreate() {
		this.CreatedAt = new Date();
	}
	@PreUpdate
	protected void onUpdate() {
		this.UpdatedAt = new Date();
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
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public Double getVersion() {
		return version;
	}
	public void setVersion(Double version) {
		this.version = version;
	}
}


