package com.mediadigital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mediadigital.model.FourWheeler;
import com.mediadigital.repository.VehicleRepository;

@Component
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	VehicleRepository repo;
	
	@Override
	public void saveVehicle(FourWheeler vehicle) {
		repo.save(vehicle);
	}

	@Override
	public List<FourWheeler> findAll() {
		return repo.findAll();
	}

	@Override
	public void deleteCar(FourWheeler vehicle) {
		repo.delete(vehicle);
	}

}
