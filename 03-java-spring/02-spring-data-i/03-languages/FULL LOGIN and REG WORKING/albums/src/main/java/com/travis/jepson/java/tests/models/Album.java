package com.travis.jepson.java.tests.models;

// MAKE SURE THE DATE IS util.date
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
// SOMETIMES THESE VALUES ARE HIDDEN
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;


// COMMAND + SHITF + O to auto add these
// ALWAYS IMPORT from java.persistence.Table ** SEE ABOVE **
@Entity
@Table(name="albums")  // PLURAL here at table


// ** WHEN ADDING THIS MODELS **
// INITIALLY --- select ADD => new PACKAGE
// WHEN CREATING THIS FILE, select ADD => new CLASS - - - - WHEN ADDING TO THE .models setup

public class Album 
{
	// CURRENT ATTRIBUTES of this class =>
	// private Long id;
	// private String albumName;
	// private String artistName;
	// private Integer year;
	// private Date createdAt;
	// private Date updatedAt;
	
	// TESTING * ADD RAW SQL * =>
	// REMEMBER these are then changed to name_name etc
	// id is automatically generated
	// INSERT INTO 'albums' (album_name, artist_name, year) VALUES ("The Way", "Fastball", 1998);
	// TRY without quotes => *** THIS IS WHAT WORKS ***
	// INSERT INTO albums (album_name, artist_name, year) VALUES ("The Way", "Fastball", 1998);
	
	// in SQL call from this class ALL =>
	//SELECT * FROM albums;
	
	// THESE ANNOTATIONS SET THE VALIDATION PARAMETERS
	
	// USER WILL NOT SEE THIS
	@Id // the ID is the primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)  // this incriments the ID ** VERY IMPORTANT **
	private Long id;  // very important to set as long
	
	@NotBlank(message="Don't forget the album name!") // use this so it accounts for blank spaces
	@Size(min=2, max=200, message="Please enter an album name between 2-200 characters.") // AFFECTS ALBUM NAME
	private String albumName;
	
	// THIS IS FOR NOT 
	
//	@NotEmpty // BUT spaces are still there
	@NotBlank(message="Don't forget the band's name!") // use this so it accounts for blank spaces
	@Size(min=2, max=200, message="Please enter a name between 2-200 characters.")
	private String artistName;  //his is BAND NAME
	
	// THIS IS FOR INTEGER so its notNULL for numbers
	// LOOK AT THE MIN AND MAX for custom messages you want it to not be just size etc
//	@Min(1800)  //dont need using range
//	@Max(10000) //dont need using range
	@NotNull(message="Don't forget to add the year!")
	@Range(min=1600, max= 99999, message="Please enter a year between 1600 and 99999.")
	private Integer year;
	
	// USER WILL NOT SEE THIS
	// LOCK THIS DATE
	@Column(updatable=false)  // ENABLE WITH JAVA.UTIL.date
	@DateTimeFormat(pattern="yyyy,MM,DD HH:mm:ss") // you  can format this
	private Date createdAt;
	
	// USER WILL NOT SEE THIS
	@DateTimeFormat(pattern="yyyy,MM,DD HH:mm:ss") // you  can format this
	private Date updatedAt;
	
	// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	// LINK TO USERS => LIKES
	// Songs.java is a child to this class
	// MAKE SURE ITS => java.util.list
	// when making a song object it lives in the album
		
	// mappedBy MAKES ASSOCIATIONS BETWEEN TWO MODELS THIS ATTRIBUTE MAKES IT CONNECT
	// connection point => albumSongIsOn
	// cascade will allow the songs to be deleted when the album is deleted.
	// the fetch type will only load these when it is requested  // EAGER will auto-load
	
	// VV taken from album.java  MAKE SURE TO FLIP THE TABLES
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
			name="album_likes",  // ref link name
			joinColumns = @JoinColumn(name="album_id"), // FLIP THIS
			inverseJoinColumns = @JoinColumn(name="user_id") //  FLIP THIS
			)
	private List<User> likers;  // this makes the whole list of albums the user likes
								// likers stores all users
	// ^^ adding the like button references this in the AlbumService.java
	
	
	// DONT FORGET TO GENERATE THE GETTERS AND SETTERS FOR THIS
	
	// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	
	
	// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	// LINK TO => SONGS
	// Songs.java is a child to this class
	// MAKE SURE ITS => java.util.list
	// when making a song object it lives in the album
	
	// mappedBy MAKES ASSOCIATIONS BETWEEN TWO MODELS THIS ATTRIBUTE MAKES IT CONNECT
	// connection point => albumSongIsOn
	// cascade will allow the songs to be deleted when the album is deleted.
	// the fetch type will only load these when it is requested  // EAGER will auto-load
	@OneToMany(mappedBy="albumSongIsOn", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Song> songs;
	// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	
	//CALL BACK METHOD this gets triggered and calls back to what it was
	// doing beforehand it was set up
	// This exists before changing any other values
	// always USE THIS!
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
	
	// KEEP THIS BLANK - - - - *** JAVA BEAN ***
	//
	// BELOW THIS click on line, hit source > constructor > toggle attributes etc
	public Album()
	{
		
	}
	
	// Likers getter and setter
	public List<User> getLikers() {
		return likers;
	}
	public void setLikers(List<User> likers) {
		this.likers = likers;
	}
	
	// THIS IS THE GENERATED CONSTRUCTOR * * *
	// toggle off ID, createdAt and updatedAt since this is automatically generated
	// clean up the @attributes etc
	public Album(String albumName, String artistName, Integer year) 
	{
		this.albumName = albumName;
		this.artistName = artistName;
		this.year = year;
	}
	
	// *** Getter and setter for connecting to child => Songs.java
	public List<Song> getSongs() {
		return songs;
	}
	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}
	// ***
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
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