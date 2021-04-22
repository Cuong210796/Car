package com.example.carfromvietnam.repository;


import com.example.carfromvietnam.model.Brand;
import com.example.carfromvietnam.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    @Query("SELECT c FROM Car c ORDER BY c.id DESC ")
    List<Car> findAllByIdOrderById();

    @Query("SELECT c FROM Car c WHERE c.brand = ?1 AND c.year = ?2")
    List<Car> findByBrandAndYear(Brand brand, int year);

}
