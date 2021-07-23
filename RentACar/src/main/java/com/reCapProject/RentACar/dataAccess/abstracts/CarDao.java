package com.reCapProject.RentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reCapProject.RentACar.entities.concretes.Car;

public interface CarDao extends JpaRepository<Car, Integer>{

}
