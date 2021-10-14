package com.example.demo.services;


import com.example.demo.entities.Brand;
import com.example.demo.entities.Model;
import com.example.demo.repositories.ModelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ModelService {

    @Autowired
    private ModelRepo modelRepo;

    public List<Model> findModelsByBrandid(long brandid) {
        return modelRepo.findModelsByBrandid(brandid);
    }




    public List<Model> getByName(String name) {
return modelRepo.getByName(name);

    }

    public Model addModel(Model model) {
        return modelRepo.save(model);
    }

}
