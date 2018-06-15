package com.globomatics.bike.controller;

import com.globomatics.bike.model.Bike;
import com.globomatics.bike.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikeController {
  @Autowired
  private BikeService bikeService;

  @GetMapping
  public List<Bike> getAllBikes(){
      List<Bike> bikes = bikeService.getAllBikes();
      return bikes;
  }

  @GetMapping("/{id}")
  public Bike getBikeById(@PathVariable("id") Long id){
    return bikeService.getBikeById(id);
  }

  @PostMapping
  public ResponseEntity<Bike> createBike(@RequestBody Bike bike){
  Bike savedBike = bikeService.saveBike(bike);
  return new ResponseEntity<>(savedBike, HttpStatus.OK);
  }

}
