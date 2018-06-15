package com.globomatics.bike.repository;

import com.globomatics.bike.model.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Long> {
Bike findBikeById(Long id);
}
