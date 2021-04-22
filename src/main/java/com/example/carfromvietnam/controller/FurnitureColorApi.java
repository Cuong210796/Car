package com.example.carfromvietnam.controller;

import com.example.carfromvietnam.model.Color;
import com.example.carfromvietnam.model.FurnitureColor;
import com.example.carfromvietnam.service.FurnitureColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class FurnitureColorApi {
    @Autowired
    private FurnitureColorService furnitureColorService;

    @GetMapping("/furnitureColor")
    public List<FurnitureColor> getAllColors() {
        return furnitureColorService.getAll();
    }
}
