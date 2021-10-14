package com.example.demo.services;


import com.example.demo.entities.Brand;
import com.example.demo.repositories.BrandRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService {

    @Autowired
    private BrandRepo brandRepo;


    public List<Brand> getAll() {return brandRepo.findAll(); }

    public Brand addBrand(Brand brand) {
        return brandRepo.save(brand);
    }
}
