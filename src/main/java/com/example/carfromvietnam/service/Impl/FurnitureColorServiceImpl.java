package com.example.carfromvietnam.service.Impl;

import com.example.carfromvietnam.model.FurnitureColor;
import com.example.carfromvietnam.repository.FurnitureColorRepository;
import com.example.carfromvietnam.service.FurnitureColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FurnitureColorServiceImpl implements FurnitureColorService {

    @Autowired
    private FurnitureColorRepository furnitureColorRepository;

    @Override
    public List<FurnitureColor> getAll() {
        return furnitureColorRepository.findAll();
    }
}
