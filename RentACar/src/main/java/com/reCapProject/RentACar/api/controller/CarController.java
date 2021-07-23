package com.reCapProject.RentACar.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reCapProject.RentACar.business.abstracts.CarService;
import com.reCapProject.RentACar.core.utilities.results.DataResult;
import com.reCapProject.RentACar.entities.concretes.Car;

@RestController
@RequestMapping("/api/cars")
public class CarController {

	@Autowired
	private CarService carService;

	@GetMapping("/getall")
	public DataResult<List<Car>> getAll() {

		return this.carService.getAll();
	}
}
