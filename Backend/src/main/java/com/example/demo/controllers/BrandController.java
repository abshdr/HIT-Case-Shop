package com.example.demo.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entities.BrandEntity;
import com.example.demo.services.BrandService;
import java.util.List;


@RestController
@RequestMapping("/rest")

public class BrandController {
@Autowired
private BrandService brandService;

@GetMapping("/getAllBrands")
        public List<BrandEntity> getAll() {
        return brandService.getAll();
    }



    @PostMapping("/register/brands")
    public BrandEntity register(@RequestBody BrandEntity brand) {
    return brandService.addBrand(brand);
    }

}





