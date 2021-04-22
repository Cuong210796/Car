package com.example.carfromvietnam.service;



import com.example.carfromvietnam.controller.request.CarRequest;
import com.example.carfromvietnam.model.Car;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface CarService {
    List<Car> findAll();
    Optional<Car> findById(Long id);
    Car save(String file, CarRequest carRequest);
    void delete(Car car);

    List<Car> getAllByBrandAndYear(long brandid, int year);

    List<Car> findAllCarByIdOderById();

}
