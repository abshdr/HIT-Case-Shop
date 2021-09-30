package com.example.demo.controllers;
import com.example.demo.entities.Dimension;
import com.example.demo.entities.Case;
import com.example.demo.entities.Model;
import com.example.demo.services.DimensionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@RestController
public class DimensionController {
    @Autowired
    private DimensionService dimensionService;

@GetMapping("/rest/getCasesBymodelName/{name}")
    public List<Dimension> getCasesByName(@PathVariable String name){
    return dimensionService.getCasesByName(name);
}

}
