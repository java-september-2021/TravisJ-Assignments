package com.travis.jepson.java.tests.models;

// MAKE SURE THE DATE IS util.date
import java.util.Date;

// SOMETIMES THESE VALUES ARE HIDDEN
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

// COMMAND + SHITF + O to auto add these
// ALWAYS IMPORT from java.persistence.Table ** SEE ABOVE **
@Entity
@Table(name="albums")  // PLURAL here at table


// WHEN ADDING THIS MODELS INITIALLY --- select ADD => new PACKAGE
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
	// TRY without quotes because SQL IS fffffs
	// INSERT INTO albums (album_name, artist_name, year) VALUES ("The Way", "Fastball", 1998);
	
	
	
	// in SQL call from this class ALL =>
	//SELECT * FROM albums;

	
	// THESE ANNOTATIONS SET THE VALIDATION PARAMETERS
	
	@Id // the ID is the primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)  // this incriments the ID ** VERY IMPORTANT **
	private Long id;  // very important to set as long
	
	// AFFECTS ALBUM NAME
	@Size(min=2, max=200)
	private String albumName;
	
	// THIS IS FOR NOT 
	
//	@NotEmpty // BUT spaces are still there
	@NotBlank // use this so it accounts for blank spaces
	@Size(min=2, max=200)
	private String artistName;  //his is BAND NAME
	
	// THIS IS FOR INTEGER so its notNULL for numbers
	// LOOK AT THE MIN AND MAX for custom messages you want it to not be just size etc
	@NotNull
//	@Min(1800)  //dont need using range
//	@max(10000) //dont need using range
	@Range(min=1600, max= 99999)
	private Integer year;
	
	@Column(updatable=false)  // ENABLE WITH JAVA.UTIL.date
	@DateTimeFormat(pattern="yyyy,MM,DD HH:mm:ss")
	private Date createdAt;
	
	@DateTimeFormat(pattern="yyyy,MM,DD HH:mm:ss")
	private Date updatedAt;
	
	//CALL BACK METHOD this gets triggered and calls back to what it was
	// doing beforehand it was set up
	// This exists before changing any other values
	
	@PrePersist
	protected void onCreate()
	{
		this.createdAt = new Date();
	}
	
	@PreUpdate
	protected void onUpdate()
	{
		this.updatedAt = new Date();
	}
	
	// KEEP THIS BLANK - - - - JAVA BEAN
	public Album()
	{
		
	}

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
}