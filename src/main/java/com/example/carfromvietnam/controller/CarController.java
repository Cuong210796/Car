package com.example.carfromvietnam.controller;

import com.example.carfromvietnam.controller.request.CarRequest;
import com.example.carfromvietnam.controller.request.SearchByBrandAndYearRequest;
import com.example.carfromvietnam.exception.ResourceNotFoundException;
import com.example.carfromvietnam.model.Car;
import com.example.carfromvietnam.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/v1")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public List<Car> getAllCar(){
        return carService.findAll();
    }


    @PostMapping("/cars")
    public Car createCar(@RequestBody CarRequest carRequest, String file) {
        return carService.save(file,carRequest);
    }

    @GetMapping("/cars/search")
    public List<Car> searchCar(@RequestBody SearchByBrandAndYearRequest requestModel) {
        return carService.getAllByBrandAndYear(requestModel.getBrandid(), requestModel.getYear());
    }

    @GetMapping("/cars/{id}")
    public ResponseEntity<Car> getCarById(@PathVariable Long id) {
        Car car = carService.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Car not exist with id :" + id));
        return ResponseEntity.ok(car);
    }

    @PutMapping("/cars")
    public ResponseEntity<Car> updateCar(@RequestBody CarRequest carRequest, @RequestBody  String file) throws IOException {
        Car updatedCar = carService.save(file,carRequest);
        return ResponseEntity.ok(updatedCar);
    }

    @DeleteMapping("/cars/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteCar(@PathVariable Long id){
        Car car = carService.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Car not exist with id :" + id));

        carService.delete(car);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
