package com.example.demo.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entities.Brand;
import com.example.demo.services.BrandService;
import java.util.List;


@RestController
public class BrandController {
@Autowired
private BrandService brandService;

@GetMapping("/brands")
        public List<Brand> getAll() {
        return brandService.getAll();
    }



    @PostMapping("/register/brands")
    public Brand register(@RequestBody Brand brand) {
    return brandService.addBrand(brand);
    }

}





