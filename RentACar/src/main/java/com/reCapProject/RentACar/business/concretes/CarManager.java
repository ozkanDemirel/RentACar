package com.reCapProject.RentACar.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reCapProject.RentACar.business.abstracts.CarService;
import com.reCapProject.RentACar.core.utilities.results.DataResult;
import com.reCapProject.RentACar.core.utilities.results.SuccessDataResult;
import com.reCapProject.RentACar.dataAccess.abstracts.CarDao;
import com.reCapProject.RentACar.entities.concretes.Car;

@Service
public class CarManager implements CarService {
	
	@Autowired
	private CarDao carDao;

	@Override
	public DataResult<List<Car>> getAll() {
		
		return new SuccessDataResult<List<Car>>(this.carDao.findAll(), "Data Listelendi");
				
	}

	@Override
	public List<Car> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

}
