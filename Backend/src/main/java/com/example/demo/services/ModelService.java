package com.example.demo.services;


import com.example.demo.entities.ModelEntity;
import com.example.demo.repositories.ModelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ModelService {

    @Autowired
    private ModelRepo modelRepo;

    public List<ModelEntity> findModelsByBrandid(long brandId) {
        return modelRepo.findByBrandId(brandId);
    }




    public List<ModelEntity> getByName(String name) {
return modelRepo.getByName(name);

    }

    public ModelEntity addModel(ModelEntity model) {
        return modelRepo.save(model);
    }

    public List<ModelEntity> getByPhrase(String phrase) {
        List<ModelEntity> AllModels;
        List<ModelEntity> phraseModels = new ArrayList<>();
        AllModels = modelRepo.findAll();

        for(ModelEntity model : AllModels){
           if( model.getName().toLowerCase().contains(phrase.toLowerCase()))
                {
                    phraseModels.add(model);
                }

        }
        return phraseModels;

    }
}
