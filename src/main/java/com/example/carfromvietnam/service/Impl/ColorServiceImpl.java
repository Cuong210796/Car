package com.example.carfromvietnam.service.Impl;

import com.example.carfromvietnam.model.Color;
import com.example.carfromvietnam.repository.ColorRepository;
import com.example.carfromvietnam.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorServiceImpl implements ColorService {

    @Autowired
    private ColorRepository repo;

    @Override
    public List<Color> getAll() {
        return repo.findAll();
    }
}
