package com.travis.jepson.java.tests.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

// THIS file is made by adding a class to the .models


@Entity
@Table(name="albums")  // PLURAL here at table
public class Song 
{

	@Id // the ID is the primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message="Don't forget the song's name!") 
	@Size(min=4, max=200, message="Please enter an album name between 4-200 characters.")
	private String songName;
	
	@NotBlank(message="Don't forget to add some lyrics!") 
	@Size(min=10, max=200, message="Please enter a name between 10-200 characters.")
	private String songOpeningLyrics;
	
	@NotNull(message="Don't forget to add the time in seconds!")
	@Range(min=5, max= 99999, message="Please enter your time between 5 and 99999 seconds.")
	private Integer songDurationInSeconds;
	
	
	private String songLength;
	
	@Column(updatable=false)  
	@DateTimeFormat(pattern="yyyy,MM,DD HH:mm:ss") 
	private Date createdAt;
	
	@DateTimeFormat(pattern="yyyy,MM,DD HH:mm:ss") 
	private Date updatedAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getSongOpeningLyrics() {
		return songOpeningLyrics;
	}

	public void setSongOpeningLyrics(String songOpeningLyrics) {
		this.songOpeningLyrics = songOpeningLyrics;
	}

	public Integer getSongDurationInSeconds() {
		return songDurationInSeconds;
	}

	public void setSongDurationInSeconds(Integer songDurationInSeconds) {
		this.songDurationInSeconds = songDurationInSeconds;
	}

	public String getSongLength() {
		return songLength;
	}

	public void setSongLength(String songLength) {
		this.songLength = songLength;
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
	
	// AFTER SETTING ALL VARIABLES REMEMBER TO GENERATE GETTERS AND SETTERS
	
	
	
}
