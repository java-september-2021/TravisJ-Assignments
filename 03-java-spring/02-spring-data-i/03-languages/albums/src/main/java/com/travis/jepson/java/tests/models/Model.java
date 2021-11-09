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
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

// id
// String image_url
// modelName
// modelDescription
// createdAt
// updatedAt



@Entity
@Table(name="models")
public class Model 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	// private byte[] picture; // Can store like this but its really big takes a lot of time/ram
	
															// connects to 
	@NotBlank													// this stores NOTHING in DB
	private String image_url = "/images/not-available.jpg";   //This sets default to the image uploaded
	
	@NotBlank(message="Please enter your miniature's name!")
	@Size(max=50, message="Please keep your miniature's name less than 50 characters!")
	private String modelName;
	
	@NotBlank(message="Please describe your miniature!")
	@Size(max=500, message="Please keep your description less than 500 characters!")
	private String modelDescription;
	
//	@NonNull   // SETUP LATER!
//	private Boolean modelForSale = false;  // default false
	
	// toggle if for sale price comes up
	
	
	// not seen by user VV
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy,MM,DD HH:mm:ss")
	private Date createdAt;
	// THIS SETS THE CREATED AT TO EXIST AND auto assigns
	@PrePersist
	protected void onCreate()
	{
		this.createdAt = new Date();
	}
	
	@DateTimeFormat(pattern="yyyy,MM,DD HH:mm:ss") // you  can format this
	private Date updatedAt;	
	// This only does this ONLY when the object is updated
	@PreUpdate
	protected void onUpdate(){
		this.updatedAt = new Date();  //MUST BE CALLED UPDATED AT
	}
	
	
	// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	// LINK TO => ALBUMS
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="album_id")
	private Album album;
	// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	
	
	
	public Model() 
	{
		// BEANNNNNN
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getImage_url() {
		return image_url;
	}



	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}



	public String getModelName() {
		return modelName;
	}



	public void setModelName(String modelName) {
		this.modelName = modelName;
	}



	public String getModelDescription() {
		return modelDescription;
	}



	public void setModelDescription(String modelDescription) {
		this.modelDescription = modelDescription;
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



	public Album getAlbum() {
		return album;
	}



	public void setAlbum(Album album) {
		this.album = album;
	}
	
	
	
}
