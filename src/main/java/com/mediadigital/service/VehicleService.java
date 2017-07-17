package com.mediadigital.service;

import java.util.List;

import com.mediadigital.model.FourWheeler;

public interface VehicleService {

	void saveVehicle(FourWheeler vehicle);

	List<FourWheeler> findAll();

	void deleteCar(FourWheeler vehicle);

}
