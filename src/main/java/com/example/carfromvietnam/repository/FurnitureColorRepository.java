package com.example.carfromvietnam.repository;

import com.example.carfromvietnam.model.Color;
import com.example.carfromvietnam.model.FurnitureColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FurnitureColorRepository extends JpaRepository<FurnitureColor, Long> {
}
