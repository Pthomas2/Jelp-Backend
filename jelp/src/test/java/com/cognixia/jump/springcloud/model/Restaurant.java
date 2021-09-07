package com.cognixia.jump.springcloud.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Restaurant implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long restaurant_id;
	
	@Column
	private String name;
	
	@Column
	private String address;
	
	@Column
	private String phone;
	
	@Column
	private String city;
	
	@Column
	private String state;
	
	@Column
	private String country;
	
	@Column
	private String description;
	
	@Transient
	List<Review> reviews;
	
	


	
	public Restaurant(Long restaurant_id, String name, String address, String phone, String city, String state,
			String country, String description, List<Review> reviews) {
		super();
		this.restaurant_id = restaurant_id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.city = city;
		this.state = state;
		this.country = country;
		this.description = description;
		this.reviews = reviews;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getRestaurant_id() {
		return restaurant_id;
	}

	public void setRestaurant_id(Long restaurant_id) {
		this.restaurant_id = restaurant_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Restaurant [restaurant_id=" + restaurant_id + ", name=" + name + ", address=" + address + ", phone="
				+ phone + ", city=" + city + ", state=" + state + ", country=" + country + ", description="
				+ description + ", reviews=" + reviews + "]";
	}

	


	
	

}
