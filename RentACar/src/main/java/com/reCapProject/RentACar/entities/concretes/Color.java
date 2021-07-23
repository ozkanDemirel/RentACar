package com.reCapProject.RentACar.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "colors")
public class Color {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "color_name")
	private String colorName;
}
