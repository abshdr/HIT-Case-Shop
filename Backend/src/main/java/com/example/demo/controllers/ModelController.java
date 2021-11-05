package com.example.demo.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entities.ModelEntity;
import com.example.demo.services.ModelService;
import java.util.List;


@RestController
@RequestMapping("/rest")

public class ModelController {
    @Autowired
    private ModelService modelService;

    @GetMapping("/getAllModels")
    public List<ModelEntity> getAll() {
        return modelService.getAll();
    }

    @GetMapping("/search/models/by/brand/{brandid}")
    public List<ModelEntity> getModelsByBrandId(@PathVariable long brandid) {
        return modelService.findModelsByBrandid(brandid);
    }

    @GetMapping("/search/for/models/by/modelName/{name}")
    public List<ModelEntity> getByName(@PathVariable String name){
        return modelService.getByName(name);
    }

    @GetMapping("/search/for/model/by/phrase/{phrase}")
    public List<ModelEntity> getByPhrase(@PathVariable String phrase){
        return modelService.getByPhrase(phrase);
    }


    @PostMapping("/register/model")
    public ModelEntity register(@RequestBody ModelEntity model) {
        return modelService.addModel(model);
    }
}
