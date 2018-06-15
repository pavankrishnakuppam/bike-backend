package com.globomatics.bike.service;

import com.globomatics.bike.model.Bike;

import java.util.List;

public interface BikeService {
  List<Bike> getAllBikes();
  Bike getBikeById(Long id);
  Bike saveBike(Bike bike);
}
