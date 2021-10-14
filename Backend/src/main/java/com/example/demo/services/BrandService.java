package com.example.demo.services;


import com.example.demo.entities.BrandEntity;
import com.example.demo.repositories.BrandRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService {

    @Autowired
    private BrandRepo brandRepo;


    public List<BrandEntity> getAll() {return brandRepo.findAll(); }

    public BrandEntity addBrand(BrandEntity brand) {
        return brandRepo.save(brand);
    }
}
