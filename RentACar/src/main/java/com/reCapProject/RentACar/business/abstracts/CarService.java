package com.reCapProject.RentACar.business.abstracts;

import java.util.List;

import com.reCapProject.RentACar.core.utilities.results.DataResult;
import com.reCapProject.RentACar.entities.concretes.Car;

public interface CarService {

	DataResult<List<Car>> getAll();
	
	List<Car> getById(int id);
	public void add();
	public void update();
	public void delete();
	
	
	
	
}
