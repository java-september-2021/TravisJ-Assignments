package com.travis.jepson.java.tests.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

// THIS file is made by adding a class to the .models

@Entity
@Table(name="songs")  // PLURAL here at table *** SONGS ***
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
	
	// formatted h:MM:SS
	private String songLength;
	
	@Column(updatable=false)  
	@DateTimeFormat(pattern="yyyy,MM,DD HH:mm:ss") 
	private Date createdAt;
	
	@DateTimeFormat(pattern="yyyy,MM,DD HH:mm:ss") 
	private Date updatedAt;
	
	// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	// THIS IS HOW YOU CONNECT TO THE PARENT => Album.java
	//
	// THIS IS THE CHILD ENTITY => Assigning what songs belong to what album.
	// Note *** an array list is setup on => Album.java to check this out.
	// this ManyToOne => connects to Album.java
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="album_id")  // remember SQL naming convention PRIMARY KEY
	private Album albumSongIsOn;
	
	// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	
	
	// AFTER SETTING ALL VARIABLES REMEMBER TO GENERATE GETTERS AND SETTERS
	
	
	@PrePersist
	protected void onCreate()
	{
		this.createdAt = new Date();
	}
	// makes new date object when updated
	@PreUpdate
	protected void onUpdate()
	{
		this.updatedAt = new Date();
	}
	
	// *** DONT FORGET THE JAVA BEAN ***
	// Generate => CONSTRUCTOR USING FIELDS => Diselect all for a BEAN!
	public Song() 
	{
		// JAVA BEAN
	}
	
	// ** GETTERS AND SETTERS FOR THE CONNECTION TO PARENT Album.java
	public Album getAlbumSongIsOn() {
		return albumSongIsOn;
	}
	public void setAlbumSongIsOn(Album albumSongIsOn) {
		this.albumSongIsOn = albumSongIsOn;
	}
	// **
	
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
	

	
	
}
