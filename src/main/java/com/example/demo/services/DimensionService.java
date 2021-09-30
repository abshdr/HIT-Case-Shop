package com.example.demo.services;


import com.example.demo.entities.Dimension;

import com.example.demo.repositories.DimensionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DimensionService {

    @Autowired
    private DimensionRepo dimensionRepo;


    public List<Dimension> getCasesByName(String name) {
        return dimensionRepo.getCasesByName(name);
    }
}
