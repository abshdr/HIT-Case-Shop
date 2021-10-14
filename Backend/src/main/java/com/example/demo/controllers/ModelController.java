package com.example.demo.controllers;
import com.example.demo.entities.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entities.Model;
import com.example.demo.services.ModelService;
import java.util.List;


@RestController
public class ModelController {
    @Autowired
    private ModelService modelService;



    @GetMapping("/models/brand/{brandid}")
    public List<Model> getModelsByBrandId(@PathVariable long brandid) {
        return modelService.findModelsByBrandid(brandid);
    }

    @GetMapping("models/brand/search/{name}")
    public List<Model> getByName(@PathVariable String name){
        return modelService.getByName(name);
    }


    @PostMapping("/register/model")
    public Model register(@RequestBody Model model) {
        return modelService.addModel(model);
    }
}
