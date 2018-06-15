package com.globomatics.bike.service;

import com.globomatics.bike.model.Bike;
import com.globomatics.bike.repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BikeServiceImpl implements  BikeService {

  @Autowired
  private BikeRepository bikeRepository;


  @Override
  public List<Bike> getAllBikes() {
    return bikeRepository.findAll();
  }

  @Override
  public Bike getBikeById(Long id) {
    return bikeRepository.findBikeById(id);
  }

  @Override
  public Bike saveBike(Bike bike) {
    return bikeRepository.save(bike);
  }
}
