package com.example.carfromvietnam.service.Impl;

import com.example.carfromvietnam.controller.request.CarRequest;
import com.example.carfromvietnam.exception.ResourceNotFoundException;
import com.example.carfromvietnam.model.Brand;
import com.example.carfromvietnam.model.Car;
import com.example.carfromvietnam.model.Color;
import com.example.carfromvietnam.model.FurnitureColor;
import com.example.carfromvietnam.repository.BrandRepository;
import com.example.carfromvietnam.repository.CarRepository;
import com.example.carfromvietnam.repository.ColorRepository;
import com.example.carfromvietnam.repository.FurnitureColorRepository;
import com.example.carfromvietnam.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private BrandRepository brandRepository;

    @Autowired
    private ColorRepository colorRepository;

    @Autowired
    private FurnitureColorRepository furnitureColorRepository;

    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public Optional<Car> findById(Long id) {
        return carRepository.findById(id);
    }

    @Override
    public Car save(String file,CarRequest carRequest) {
        Car car = new Car();
        if (carRequest.getId() != null) {
            car.setId(carRequest.getId());
        }
        car.setModel(carRequest.getModel());
        car.setYear(carRequest.getYear());
        String[] strs = carRequest.getImage().split(",");
        if (strs.length >=2) {
            car.setImage(carRequest.getImage());
            byte[] bytesCode = strs[1].getBytes();
            // lưu bytesCode vào sever xử lý như lưu ảnh
        }
        car.setCarPrice(carRequest.getCarPrice());
        car.setEngine(carRequest.getEngine());
        car.setDoorNumber(carRequest.getDoorNumber());
        car.setSeatNumber(carRequest.getSeatNumber());
        car.setBrand(brandRepository.findById(carRequest.getBrandid()).get());
        car.setColors(Arrays.asList(carRequest.getColorids()).stream().map(item -> colorRepository.findById(item).get())
            .collect(Collectors.toList()));
        car.setFurnitureColors(Arrays.asList(carRequest.getFurnitureColorids()).stream().map(id ->
                furnitureColorRepository.findById(id).get())
            .collect(Collectors.toList()));
        car.setContent(carRequest.getContent());
        return carRepository.save(car);
    }

    @Override
    public void delete(Car car) {
        carRepository.delete(car);
    }

    @Override
    public List<Car> findAllCarByIdOderById() {
        return carRepository.findAllByIdOrderById();
    }

    @Override
    public List<Car> getAllByBrandAndYear(long brandid, int year) {
        Brand brand = brandRepository.getOne(brandid);
        return carRepository.findByBrandAndYear(brand, year);
    }
}
