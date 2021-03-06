package com.reCapProject.RentACar.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "cars")
public class Car {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "brand_id")
	private int brandId;
	
	@Column(name = "color_id")
	private int colorId;
	
	@Column(name = "model_year")
	private String modelYear;
	
	@Column(name = "daily_price")
	private double dailyPrice;
	
	@Column(name = "description")
	private String description; 

}
