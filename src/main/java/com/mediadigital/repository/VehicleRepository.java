package com.mediadigital.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mediadigital.model.FourWheeler;

/**
 * @author amit
 *
 */
public interface VehicleRepository  extends MongoRepository<FourWheeler, String> {

}
