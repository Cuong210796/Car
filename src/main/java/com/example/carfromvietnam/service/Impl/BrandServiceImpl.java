package com.example.carfromvietnam.service.Impl;

import com.example.carfromvietnam.model.Brand;
import com.example.carfromvietnam.repository.BrandRepository;
import com.example.carfromvietnam.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandRepository brandRepository;

    @Override
    public List<Brand> findAll() {
        return brandRepository.findAll();
    }
}
